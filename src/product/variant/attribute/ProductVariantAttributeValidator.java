package product.variant.attribute;

import util.validator.BaseValidator;
import util.validator.RegexList;

public class ProductVariantAttributeValidator extends BaseValidator<ProductVariantAttribute> {

    @Override
    public void validate(ProductVariantAttribute attribute) {

        isNotNull("Variant attribute", attribute);

        validateField("Variant attribute id", attribute.getId());

        validateField("Variant attribute name", attribute.getName(), RegexList.baseName);
    }

}
