package Product;

import java.util.LinkedList;

public class ProductVariantValueRepository {

    LinkedList<ProductVariantValue> valueDB;

    ProductVariantValueRepository() {

        this.valueDB = new LinkedList<>();
    }

    public boolean addProductVariantValue(ProductVariantValue value) {
        return valueDB.add(value);
    }

    public boolean removeProductVariantValue(int valueId) {
        return valueDB.removeIf(value -> value.getId() == valueId);
    }

}
