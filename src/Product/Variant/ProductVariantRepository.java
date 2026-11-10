package Product.Variant;

import java.util.LinkedList;
import java.util.stream.Collectors;

public class ProductVariantRepository {

    LinkedList<ProductVariant> variantDB;

    ProductVariantRepository() {

        this.variantDB = new LinkedList<>();
    }

    public boolean addProductVariant(ProductVariant variant) {
        return variantDB.add(variant);
    }

    public boolean removeProductVariant(int variantId) {
        return variantDB.removeIf(variant -> variant.getId() == variantId);
    }

    public ProductVariant findProductVariantById(int variantId) {

        return variantDB.stream()
                        .filter(variant -> variant.getId() == variantId)
                        .findFirst()
                        .orElse(null);
    }

    public LinkedList<ProductVariant> findProductVariants(int productId) {

        LinkedList<ProductVariant> productVariants = variantDB.stream()
                                                                .filter(variant -> variant.getProductId() == productId)
                                                                .collect(Collectors.toCollection(LinkedList::new));

        return productVariants.isEmpty() ? null : productVariants;
    }

}
