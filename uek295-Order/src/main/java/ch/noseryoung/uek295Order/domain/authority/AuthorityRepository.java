package ch.noseryoung.uek295Order.domain.authority;

import ch.noseryoung.uek295Order.domain.order.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorityRepository extends JpaRepository<Authority, Integer> {

}
