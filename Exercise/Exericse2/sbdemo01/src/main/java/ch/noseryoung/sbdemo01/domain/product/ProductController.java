package ch.noseryoung.sbdemo01.domain.product;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductController {
    private final ProductService service;
    public ProductController(ProductService service){
        this.service = service;
    }

    @PostMapping("/insert")
    public ResponseEntity<HttpStatus> addProduct(@RequestBody Product product){
        return service.createProduct(product);
    }

    @DeleteMapping("/drop")
    public ResponseEntity<HttpStatus> dropProduct(@RequestBody Product product){
        return service.deleteProduct(product);
    }

    @PutMapping("/update")
    @DeleteMapping("/drop")
    public ResponseEntity<HttpStatus> updateProduct(@RequestBody Product product){
        return service.deleteProduct(product);
    }

    @GetMapping("/get")
    public ResponseEntity<List<Product>> getProducts(){
        return ResponseEntity.ok().body(service.getAllProducts());
    }

    @GetMapping("/get/id={productId}")
    public ResponseEntity<Product> getProductByIndex(@PathVariable("productId") Integer productId){
        return ResponseEntity.ok().body(service.getProductById(productId));
    }

}
