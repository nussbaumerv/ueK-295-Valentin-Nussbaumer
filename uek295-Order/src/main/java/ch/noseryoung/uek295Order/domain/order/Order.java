package ch.noseryoung.uek295Order.domain.order;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.*;

@Entity(name = "OrderDB")
@Getter
@Setter
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer orderID;

    @Positive(message = "CostumerID Must be positive")
    @Max(value = 2147483647, message = "CustomerID can't be that big")
    @NotNull(message = "CostumerID can't be null")
    private Integer customerID;

    @Max(value = 10, message = "There only 10 Shipping Methods available")
    @PositiveOrZero(message = "shippingMethodID Must be positive or zero")
    private Integer shippingMethodID;
    @Max(value = 2147483647, message = "bookID can't be that big")
    @Positive(message = "bookID Must be positive")
    @NotNull(message = "bookID can't be null")
    private Integer bookID;


}