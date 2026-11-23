package product.price;

import util.validator.BaseValidator;
import util.validator.RegexList;

public class ProductPriceValidator extends BaseValidator<ProductPrice> {

    @Override
    public void validate(ProductPrice price) {

        isNotNull("Product price", price);

        validateField("Product price id", price.getId());

        validateField("Product price productId", price.getProductId());

        validateField("Product price timestamp", price.getTimestamp(), RegexList.priceTimestamp);

        validateField("Product price", price.getPrice());
    }

}
