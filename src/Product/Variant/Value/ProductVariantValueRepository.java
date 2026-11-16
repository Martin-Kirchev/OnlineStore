package Product.Variant.Value;

import java.util.LinkedList;

public class ProductVariantValueRepository {

    LinkedList<ProductVariantValue> valueDB;

    public ProductVariantValueRepository() {

        this.valueDB = new LinkedList<>();
    }

    public boolean addProductVariantValue(ProductVariantValue value) {
        return valueDB.add(value);
    }

    public boolean removeProductVariantValue(int valueId) {
        return valueDB.removeIf(value -> value.getId() == valueId);
    }

    public ProductVariantValue findValueById(int valueId) {

        return valueDB.stream()
                        .filter(value -> value.getId() == valueId)
                        .findFirst()
                        .orElse(null);
    }

}
