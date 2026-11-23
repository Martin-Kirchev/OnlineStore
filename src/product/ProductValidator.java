package product;

import util.validator.BaseValidator;

public class ProductValidator extends BaseValidator<Product> {

    private static final String nameRegex = "";
    private static final String descriptionRegex = "";

    @Override
    public void validate(Product product) {

        isNotNull("Product", product);

        validateField("Product id", product.getId());

        validateField("Product name", product.getName(), nameRegex);

        validateField("Product description", product.getDescription(), descriptionRegex);
    }
}
