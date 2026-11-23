package product.variant.attribute;

import util.validator.BaseValidator;
import util.validator.RegexList;

public class ProductVariantAttributeValidator extends BaseValidator<ProductVariantAttribute> {

    @Override
    public void validate(ProductVariantAttribute attribute) {

        isNotNull("Product variant attribute", attribute);

        validateField("Product variant attribute id", attribute.getId());

        validateField("Product variant attribute name", attribute.getName(), RegexList.variantName);
    }

}
