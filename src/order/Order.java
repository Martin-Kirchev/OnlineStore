package order;

import util.entity.BaseEntity;

public class Order extends BaseEntity {

    int userId;
    String timestamp;
    int paymentId;

    public Order(int id, int userId, String timestamp, int paymentId) {

        this.setId(id);
        this.userId = userId;
        this.timestamp = timestamp;
        this.paymentId = paymentId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public int getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(int paymentId) {
        this.paymentId = paymentId;
    }

}
