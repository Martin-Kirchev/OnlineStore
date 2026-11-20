package Order;

import util.BaseRepository;

import java.util.LinkedList;
import java.util.stream.Collectors;

public class OrderRepository extends BaseRepository<Order> {

    public OrderRepository() {}

    public LinkedList<Order> findUserOrders(int userId) {

        LinkedList<Order> userOrders = this.getStream()
                                            .filter(order -> order.getUserId() == userId)
                                            .collect(Collectors.toCollection(LinkedList::new));

        return userOrders.isEmpty() ? null : userOrders;
    }

}