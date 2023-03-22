package ch.noseryoung.uek295Order.domain.order;
import lombok.extern.log4j.Log4j;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
@Log4j2
@Service
public class OrderService {
    @Autowired
    private final OrderRepository repository;
    public OrderService(OrderRepository repository){
        this.repository = repository;
    }
    public List<Order> getAllOrders(){
        return repository.findAll();
    }

    public Order getOrderById(int id) {
        return repository.findById(id);
    }

    public ResponseEntity<HttpStatus> createOrder(Order order){
        repository.save(order);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    public ResponseEntity<HttpStatus> deleteOrder(Order product){
        repository.delete(product);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
    public ResponseEntity<HttpStatus> updateOrder(Order orderNew){
        Order orderOld = getOrderById(orderNew.getOrderID());
        orderOld.setCustomerID(orderNew.getCustomerID());
        orderOld.setShippingMethodID(orderNew.getShippingMethodID());
        orderOld.setOrderID(orderNew.getOrderID());
        repository.save(orderOld);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
    public ResponseEntity<HttpStatus> deleteOrderById(int id){
        repository.delete(repository.findById(id));
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

}
