package Product.Variant;

import util.BaseRepository;

import java.util.LinkedList;
import java.util.stream.Collectors;

public class ProductVariantRepository extends BaseRepository<ProductVariant> {

    public ProductVariantRepository() {}

    public LinkedList<ProductVariant> findProductVariants(int productId) {

        LinkedList<ProductVariant> productVariants = this.getStream()
                                                            .filter(variant -> variant.getProductId() == productId)
                                                            .collect(Collectors.toCollection(LinkedList::new));

        return productVariants.isEmpty() ? null : productVariants;
    }

}
