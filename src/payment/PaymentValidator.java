package payment;

import util.validator.BaseValidator;
import util.validator.RegexList;

public class PaymentValidator extends BaseValidator<Payment> {

    @Override
    public void validate(Payment payment) {

        isNotNull("Payment", payment);

        validateField("Payment id", payment.getId());

        validateField("Payment type", payment.getType(), RegexList.paymentType);

        validateField("Payment status", payment.getStatus(), RegexList.paymentStatus);

        validateField("Payment price", payment.getPrice());
    }
}
