package ch.noseryoung.uek295Order.domain.security;


import java.util.Collection;

import ch.noseryoung.uek295Order.domain.user.User;
import ch.noseryoung.uek295Order.domain.user.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserDetailsService {
    UserRepository repository;
    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        return new UserDetailsImpl(repository.findByEmail(email));
    }

    public record UserDetailsImpl(User user) implements UserDetails {
        @Override
        public Collection<? extends GrantedAuthority> getAuthorities() {
            return user.getRoles().stream().flatMap(r -> r.getAuthorities().stream())
                    .map(a -> new SimpleGrantedAuthority(a.getName()))
                    .toList();
        }

        @Override
        public String getPassword() {
            return user.getPassword();
        }

        @Override
        public String getUsername() {
            return user.getEmail();
        }

        @Override
        public boolean isAccountNonExpired() {
            return true;
        }

        @Override
        public boolean isAccountNonLocked() {
            return true;
        }

        @Override
        public boolean isCredentialsNonExpired() {
            return true;
        }

        @Override
        public boolean isEnabled() {
            return true;
        }
    }





}