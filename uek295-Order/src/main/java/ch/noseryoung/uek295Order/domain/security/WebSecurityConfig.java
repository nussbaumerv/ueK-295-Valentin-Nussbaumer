package ch.noseryoung.uek295Order.domain.security;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@EnableWebSecurity
@RequiredArgsConstructor
@EnableGlobalMethodSecurity(prePostEnabled = true, securedEnabled = true, jsr250Enabled = true)
/*1. enables pre- / post-annotations: checks method before/after running it, allows the result to be altered
2. allows @secured annotation: which roles can use x method
3. allows @roleallowed annotation: jsr-250 version of @secured */
public class WebSecurityConfig {



  /*
   private final UserDetailsService userService;
  private final PasswordEncoder passwordEncoder;
  */

    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    /*userDetailsService retrieves username, password and any other authentication variables */
    @Bean
    public UserDetailsService userDetailsService() {
        InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
        manager.createUser(User.withUsername("user")
                .password("1234")
                .roles("USER")
                .build());
        return manager;
    }

/*
  @Bean
  public AuthenticationManager authenticationManager() {
    DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
    provider.setPasswordEncoder(passwordEncoder);
    provider.setUserDetailsService(userService);
    return new ProviderManager(provider);
  }
  */


    /*filter chain which can be matched with an HTTP request */
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                //set security by urls
                .antMatchers("/public/**").permitAll()
                .anyRequest()
                .authenticated()
                .and()
                .httpBasic() //enable HTTP-Basic Auth
                //Disable CORS and CSRF protection
                .and().csrf()
                .disable().cors().disable()
                .sessionManagement()
                .sessionCreationPolicy(SessionCreationPolicy.STATELESS); //never creates an HTTP session

        return http.build();
    }

}


