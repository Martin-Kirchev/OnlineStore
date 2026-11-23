package product.variant;

import util.entity.BaseEntity;

public class ProductVariant extends BaseEntity {

    int productId;
    int quantity;
    int attributeId;
    int valueId;

    public ProductVariant(int id, int productId, int quantity, int attributeId, int valueId) {

        this.setId(id);
        this.productId = productId;
        this.quantity = quantity;
        this.attributeId = attributeId;
        this.valueId = valueId;
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
