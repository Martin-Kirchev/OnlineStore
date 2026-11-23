package product.variant.value;

import util.validator.BaseValidator;
import util.validator.RegexList;

public class ProductVariantValueValidator extends BaseValidator<ProductVariantValue> {

    @Override
    public void validate(ProductVariantValue value) {

        isNotNull("Product value", value);

        validateField("Product variant value id", value.getId());

        validateField("Product variant value name", value.getName(), RegexList.variantName);

    }

}
