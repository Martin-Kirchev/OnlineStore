package Product.Price;

public class ProductPrice {

    int productId;
    String timestamp;
    double price;

    public ProductPrice(int productId, String timestamp, double price) {

        this.productId = productId;
        this.timestamp = timestamp;
        this.price = price;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
