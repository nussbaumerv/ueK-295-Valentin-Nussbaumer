package ch.noseryoung.uek295Order.domain.order;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/api")
public class OrderController {
    private final OrderService service;
    public OrderController(OrderService service){
        this.service = service;
    }

    @PostMapping("/insert")
    public ResponseEntity<HttpStatus> addOrder(@RequestBody Order order){
        return service.createOrder(order);
    }

    @DeleteMapping("/drop")
    public ResponseEntity<HttpStatus> dropOrder(@RequestBody Order order){
        return service.deleteOrder(order);
    }

    @DeleteMapping("/drop/id={orderId}")
    public ResponseEntity<HttpStatus> dropOrderById(@PathVariable("orderId") Integer orderId){
        return service.deleteOrder(service.getOrderById(orderId));
    }

    @PutMapping("/update")
    public ResponseEntity<HttpStatus> updateOrder(@RequestBody Order order){
        return service.updateOrder(order);
    }


    @GetMapping("/get")
    public ResponseEntity<List<Order>> getOrders(){
        return ResponseEntity.ok().body(service.getAllOrders());
    }

    @GetMapping("/get/id={orderId}")
    public ResponseEntity<Order> getOrderByIndex(@PathVariable("orderId") Integer orderId){
        return ResponseEntity.ok().body(service.getOrderById(orderId));
    }
/*
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<String> handleMethodArgumentNotValidException(MethodArgumentNotValidException e){
        return ResponseEntity.status(400).body(e.getFieldError().getDefaultMessage());
    }


    @ExceptionHandler(NoSuchElementException.class){
        public ResponseEntity<String> handleNoSuchElementOException(NoSuchElementException e){
            return ResponseEntity.status(404).body("Page not Found");
        }
    }

 */

}