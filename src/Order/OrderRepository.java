package Order;

import java.util.LinkedList;
import java.util.stream.Collectors;

public class OrderRepository {

    LinkedList<Order> orderDB;

    public OrderRepository() {

        this.orderDB = new LinkedList<>();
    }

    public boolean addOrder(Order order) {
        return orderDB.add(order);
    }

    public boolean removeOrder(int orderId) {
        return orderDB.removeIf(order -> order.getId() == orderId);
    }

    public Order findOrderById(int orderId) {

        return orderDB.stream()
                        .filter(order -> order.getId() == orderId)
                        .findFirst()
                        .orElse(null);
    }

    public LinkedList<Order> findUserOrders(int userId) {

        LinkedList<Order> userOrders = orderDB.stream()
                                                .filter(order -> order.getUserId() == userId)
                                                .collect(Collectors.toCollection(LinkedList::new));

        return userOrders.isEmpty() ? null : userOrders;
    }

}