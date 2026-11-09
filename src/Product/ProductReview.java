package Product;

public class ProductReview {

    int id;
    int userId;
    int productId;
    int rating;
    String description;
    String timestamp;

    public ProductReview(int id, int userId, int productId, int rating, String description, String timestamp) {

        this.id = id;
        this.userId = userId;
        this.productId = productId;
        this.rating = rating;
        this.description = description;
        this.timestamp = timestamp;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

}