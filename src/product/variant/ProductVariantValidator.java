package product.variant;

import util.validator.BaseValidator;

public class ProductVariantValidator extends BaseValidator<ProductVariant> {


    @Override
    public void validate(ProductVariant variant) {

        isNotNull("Product variant", variant);

        validateField("Product variant id", variant.getId());

        validateField("Product variant product id", variant.getProductId());

        validateField("Product variant quantity", variant.getQuantity());

        validateField("Product variant attribute id", variant.getAttributeId());

        validateField("Product variant value id", variant.getValueId());
    }

}
