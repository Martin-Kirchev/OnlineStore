package Product.Variant;

public class ProductVariant {

    int id;
    int productId;
    int quantity;
    int attribute_id;
    int value_id;

    public ProductVariant(int id, int productId, int quantity, int attribute_id, int value_id) {

        this.id = id;
        this.productId = productId;
        this.quantity = quantity;
        this.attribute_id = attribute_id;
        this.value_id = value_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getAttribute_id() {
        return attribute_id;
    }

    public void setAttribute_id(int attribute_id) {
        this.attribute_id = attribute_id;
    }

    public int getValue_id() {
        return value_id;
    }

    public void setValue_id(int value_id) {
        this.value_id = value_id;
    }
}
