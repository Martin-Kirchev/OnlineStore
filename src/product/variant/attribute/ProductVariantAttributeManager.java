package product.variant.attribute;

import util.manager.NamedManager;
import util.validator.ValidatorManager;

public class ProductVariantAttributeManager extends NamedManager<ProductVariantAttribute, ProductVariantAttributeRepository> {

    public ProductVariantAttributeManager(ProductVariantAttributeRepository repository, ValidatorManager<ProductVariantAttribute> validator) {
        super(repository, validator);
    }

}
