package product.variant.attribute;

import util.validator.BaseValidator;

public class ProductVariantAttributeValidator extends BaseValidator<ProductVariantAttribute> {

    private static final String nameRegex = "";

    @Override
    public void validate(ProductVariantAttribute attribute) {

        isNotNull("Product variant attribute", attribute);

        validateField("Product variant attribute id", attribute.getId());

        validateField("Product variant attribute name", attribute.getName(), nameRegex);
    }

}
