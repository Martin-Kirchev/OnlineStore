package product.variant;

import util.manager.BaseManager;
import util.validator.ValidatorManager;

import java.util.LinkedList;

public class ProductVariantManager extends BaseManager<ProductVariant, ProductVariantRepository> {

    public ProductVariantManager(ProductVariantRepository repository, ValidatorManager<ProductVariant> validator) {
        super(repository, validator);
    }

    public LinkedList<ProductVariant> getVariants(int productId) {

        LinkedList<ProductVariant> variants = this.getRepository().findVariants(productId);

        if(variants == null)
            throw new IllegalArgumentException("Variants for this product id doesn't exist!");

        return variants;
    }
}
