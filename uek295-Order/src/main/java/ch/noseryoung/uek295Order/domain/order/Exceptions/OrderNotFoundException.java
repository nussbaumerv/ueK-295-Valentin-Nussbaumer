package ch.noseryoung.uek295Order.domain.order.Exceptions;

public class OrderNotFoundException extends Exception{
    public OrderNotFoundException(){
        super("Order not found");
    }
}
