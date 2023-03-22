package ch.noseryoung.uek295Order.domain.order;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
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

    @Positive(message = "CostumerID Must be positive or zero")
    @NotNull(message = "CostumerID can't be null")
    private Integer customerID;
    @PositiveOrZero(message = "shippingMethodID Must be positive or zero")
    @NotNull(message = "shippingMethodID can't be null")
    private Integer shippingMethodID;
    @Positive(message = "bookID Must be positive or zero")
    @NotNull(message = "bookID can't be null")
    private Integer bookID;


}