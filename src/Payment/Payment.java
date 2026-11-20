package Payment;

import util.NamedEntity;

public class Payment extends NamedEntity {

    String type;
    String status;
    Double price;

    public Payment(int id, String type, String status, Double price) {

        this.setId(id);
        this.type = type;
        this.status = status;
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

}
