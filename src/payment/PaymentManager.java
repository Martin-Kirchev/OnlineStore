package payment;

import util.manager.NamedManager;
import util.validator.ValidatorManager;

public class PaymentManager extends NamedManager<Payment, PaymentRepository> {

    public PaymentManager(PaymentRepository repository, ValidatorManager<Payment> validator) {
        super(repository, validator);
    }

}
