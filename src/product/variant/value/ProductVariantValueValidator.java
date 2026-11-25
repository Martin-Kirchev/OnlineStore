package product.variant.value;

import util.validator.BaseValidator;
import util.validator.RegexList;

public class ProductVariantValueValidator extends BaseValidator<ProductVariantValue> {

    @Override
    public void validate(ProductVariantValue value) {

        isNotNull("Variant value", value);

        validateField("Variant value id", value.getId());

        validateField("Variant value name", value.getName(), RegexList.baseName);
    }

}
