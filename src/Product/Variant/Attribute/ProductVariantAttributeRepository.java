package Product.Variant.Attribute;

import java.util.LinkedList;

public class ProductVariantAttributeRepository {

    LinkedList<ProductVariantAttribute> attributeDB;

    ProductVariantAttributeRepository() {

        this.attributeDB = new LinkedList<>();
    }

    public boolean addProductVariantAttribute(ProductVariantAttribute attribute) {
        return attributeDB.add(attribute);
    }

    public boolean removeProductVariantAttribute(int attributeId) {
        return attributeDB.removeIf(attribute -> attribute.getId() == attributeId);
    }
}
