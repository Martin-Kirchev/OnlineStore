package order;

import util.manager.BaseManager;
import util.validator.ValidatorManager;

import java.util.LinkedList;

public class OrderManager extends BaseManager<Order, OrderRepository> {

    public OrderManager(OrderRepository repository, ValidatorManager<Order> validator) {
        super(repository, validator);
    }

    public LinkedList<Order> getUserOrders(int userId) {

        LinkedList<Order> orders = this.getRepository().findUserOrders(userId);

        if(orders == null)
            throw new IllegalArgumentException("Orders with this user id don't exist!");

        return orders;
    }
}
