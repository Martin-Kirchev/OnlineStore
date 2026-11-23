package product.variant.value;

import util.validator.BaseValidator;

public class ProductVariantValueValidator extends BaseValidator<ProductVariantValue> {

    private static final String nameRegex = "";

    @Override
    public void validate(ProductVariantValue value) {

        isNotNull("Product value", value);

        validateField("Product variant value id", value.getId());

        validateField("Product variant value name", value.getName(), nameRegex);

    }

}
