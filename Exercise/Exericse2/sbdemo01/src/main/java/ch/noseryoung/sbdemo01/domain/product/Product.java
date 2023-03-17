package ch.noseryoung.sbdemo01.domain.product;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity(name = "Test")
@Getter
@Setter
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer productID;
    private String description;
    private double price;

    public Product(String description, double price) {
        this.description = description;
        this.price = price;
    }


    public Product() {

    }
}