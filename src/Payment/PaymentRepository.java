package Payment;

import java.util.LinkedList;

public class PaymentRepository {

    LinkedList<Payment> paymentDB;

    public PaymentRepository() {

        this.paymentDB = new LinkedList<>();
    }

    public boolean addPayment(Payment payment) {
        return paymentDB.add(payment);
    }

    public boolean removePayment(int paymentId) {
        return paymentDB.removeIf(payment -> payment.getId() == paymentId);
    }

    public Payment findPaymentById(int paymentId) {

        return paymentDB.stream()
                        .filter(payment -> payment.getId() == paymentId)
                        .findFirst()
                        .orElse(null);
    }

}
