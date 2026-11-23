package product.price;

import util.validator.BaseValidator;

public class ProductPriceValidator extends BaseValidator<ProductPrice> {

    private static final String timestampRegex = "";

    @Override
    public void validate(ProductPrice price) {

        isNotNull("Product price", price);

        validateField("Product price id", price.getId());

        validateField("Product price productId", price.getProductId());

        validateField("Product price timestamp", price.getTimestamp(), timestampRegex);

        validateField("Product price", price.getPrice());
    }

}
