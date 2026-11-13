package Product.Variant;

public class ProductVariant {

    int id;
    int productId;
    int quantity;
    int attributeId;
    int valueId;

    public ProductVariant(int id, int productId, int quantity, int attributeId, int valueId) {

        this.id = id;
        this.productId = productId;
        this.quantity = quantity;
        this.attributeId = attributeId;
        this.valueId = valueId;
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

    public int getAttributeId() {
        return attributeId;
    }

    public void setAttributeId(int attributeId) {
        this.attributeId = attributeId;
    }

    public int getValueId() {
        return valueId;
    }

    public void setValueId(int valueId) {
        this.valueId = valueId;
    }
}
