package ch.noseryoung.sbdemo01.domain.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private final ProductRepository repository;
    public ProductService(ProductRepository repository){
        this.repository = repository;
    }
    public List<Product> getAllProducts(){
        return repository.findAll();
    }

    public Product getProductById(int id) {
        return repository.findById(id);
    }

    public ResponseEntity<HttpStatus> createProduct(Product product){
        repository.save(product);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    public ResponseEntity<HttpStatus> deleteProduct(Product product){
        repository.delete(product);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
    public ResponseEntity<HttpStatus> updateProduct(Product product){
        repository.delete(product);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
    public ResponseEntity<HttpStatus> deleteProductById(int id){
        repository.delete(repository.findById(id));
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

}
