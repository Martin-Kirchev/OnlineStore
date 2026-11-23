package product;

import util.validator.BaseValidator;
import util.validator.RegexList;

public class ProductValidator extends BaseValidator<Product> {

    @Override
    public void validate(Product product) {

        isNotNull("Product", product);

        validateField("Product id", product.getId());

        validateField("Product name", product.getName(), RegexList.productName);

        validateField("Product description", product.getDescription(), RegexList.productDescription);
    }
}
