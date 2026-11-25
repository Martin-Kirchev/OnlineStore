package order;

import util.manager.BaseManager;
import util.validator.ValidatorManager;

import java.util.LinkedList;

public class OrderManager extends BaseManager<Order, OrderRepository> {

    public OrderManager() {
        super(new OrderRepository(), new ValidatorManager<>(new OrderValidator()));
    }

    public LinkedList<Order> getUserOrders(int userId) {

        LinkedList<Order> orders = this.getRepository().findUserOrders(userId);

        if(orders == null)
            throw new IllegalArgumentException("Orders with this user id don't exist!");

        return orders;
    }
}
