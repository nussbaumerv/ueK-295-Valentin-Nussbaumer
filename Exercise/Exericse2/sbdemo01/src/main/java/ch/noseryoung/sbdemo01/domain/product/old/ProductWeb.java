
package ch.noseryoung.sbdemo01.domain.product.old;


import ch.noseryoung.sbdemo01.domain.product.Product;
import ch.noseryoung.sbdemo01.domain.product.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
/*
@RestController
@RequestMapping("/products")

 */
public class ProductWeb {
    /*
    public ProductWeb() {
    }
    @GetMapping ("/desc={description}&price={price}")
    public ResponseEntity<Product> findByID
    (@PathVariable("description") String description, @PathVariable("price") Double price){
        Product product = new Product(description, price);
        addProduct(product);
        return ResponseEntity.ok().body(product);
    }
    @GetMapping ("/find/id={productId}")
    public ResponseEntity<Product> find
            (@PathVariable("productId") Integer productId){
        return ResponseEntity.ok().body(findProduct(productId));
    }

    @Autowired
    private ProductRepository productRepository;

    public void addProduct(Product product) {
        productRepository.save(product);
    }

    public Product findProduct(int id){
        return productRepository.findByProductID(id);
    }

     */

}
