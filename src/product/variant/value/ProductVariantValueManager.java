package product.variant.value;

import util.manager.NamedManager;
import util.validator.ValidatorManager;

public class ProductVariantValueManager extends NamedManager<ProductVariantValue, ProductVariantValueRepository> {

    public ProductVariantValueManager(ProductVariantValueRepository repository, ValidatorManager<ProductVariantValue> validator) {
        super(repository, validator);
    }

}
