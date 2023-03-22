package ch.noseryoung.uek295Order.domain.order;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Positive;
import javax.validation.constraints.PositiveOrZero;
import javax.validation.constraints.Size;

@Entity(name = "OrderDB")
@Getter
@Setter
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer orderID;

    //@Size(min=1, max=187, message = "Must be shoerter than 187")
    private Integer customerID;
    //@PositiveOrZero(message = "Must be positive or zero")
    private Integer shippingMethodID;
    private Integer bookID;


}