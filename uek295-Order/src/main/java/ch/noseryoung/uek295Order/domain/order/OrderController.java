package ch.noseryoung.uek295Order.domain.order;

import ch.noseryoung.uek295Order.domain.order.Exceptions.OrderNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class OrderController {
    private final OrderService service;
    public OrderController(OrderService service){
        this.service = service;
    }

    @PostMapping("")
    public ResponseEntity<Order> addOrder(@Valid @RequestBody Order order){
        return service.createOrder(order);
    }

    @DeleteMapping("")
    public ResponseEntity<Order> dropOrder(@Valid @RequestBody Order order){
        return service.deleteOrder(order);
    }

    @DeleteMapping("/{orderId}")
    public ResponseEntity<Order> dropOrderById(@Valid @PathVariable("orderId") Integer orderId) throws OrderNotFoundException {
        return service.deleteOrder(service.getOrderById(orderId));
    }

    @PutMapping("")
    public ResponseEntity<Order> updateOrder(@Valid @RequestBody Order order) throws OrderNotFoundException {
        return service.updateOrder(order);
    }


    @GetMapping("")
    public ResponseEntity<List<Order>> getOrders(){
        return ResponseEntity.ok().body(service.getAllOrders());
    }

    @GetMapping("/{orderId}")
    public ResponseEntity<Order> getOrderByIndex(@Valid @PathVariable("orderId") Integer orderId) throws OrderNotFoundException {
        return ResponseEntity.ok().body(service.getOrderById(orderId));
    }
    @ExceptionHandler(OrderNotFoundException.class)
    public ResponseEntity<String> handleOrderNotFoundException(OrderNotFoundException e){
        return ResponseEntity.status(404).body(e.getMessage());
    }
    @ExceptionHandler(NoSuchElementException.class)
        public ResponseEntity<String> handleNoSuchElementException(NoSuchElementException e){
            return ResponseEntity.status(404).body("Page not Found");
        }
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<String> handleMethodArgumentNotValidException(MethodArgumentNotValidException e){
        return ResponseEntity.status(400).body(e.getFieldError().getDefaultMessage());
    }




}