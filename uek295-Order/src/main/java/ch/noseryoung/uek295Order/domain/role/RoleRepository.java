package ch.noseryoung.uek295Order.domain.role;

import ch.noseryoung.uek295Order.domain.order.Order;
import ch.noseryoung.uek295Order.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {

}
