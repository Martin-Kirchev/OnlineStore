package payment;

import util.manager.NamedManager;
import util.validator.ValidatorManager;

public class PaymentManager extends NamedManager<Payment, PaymentRepository> {

    public PaymentManager() {
        super(new PaymentRepository(), new ValidatorManager<>(new PaymentValidator()));
    }

}
