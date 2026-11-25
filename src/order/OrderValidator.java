package order;

import util.validator.BaseValidator;
import util.validator.RegexList;

public class OrderValidator extends BaseValidator<Order> {

    @Override
    public void validate(Order order) {

        isNotNull("Order", order);

        validateField("Order user id", order.getUserId());

        validateField("Order timestamp", order.getTimestamp(), RegexList.timestamp);

        validateField("Order payment id", order.getPaymentId());
    }

}
