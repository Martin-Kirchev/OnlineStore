package product;

import product.price.ProductPrice;
import product.review.ProductReview;
import product.variant.attribute.ProductVariantAttribute;
import product.variant.ProductVariant;
import product.variant.value.ProductVariantValue;

public class ProductValidator {

    private static final String nameRegex = "";
    private static final String descriptionRegex = "";
    private static final String timestampRegex = "";

    public static void validateFields(Product product) {

        if(product == null)
            throw new NullPointerException("Product is NULL!");

        validateField("id", product.getId());

        validateField("name", product.getName(), nameRegex);

        validateField("description", product.getDescription(), descriptionRegex);
    }

    public static void validateFields(ProductPrice price) {

        if(price == null)
            throw new NullPointerException("Product price is NULL!");

        validateField("price id", price.getId());

        validateField("price productId", price.getProductId());

        validateField("price timestamp", price.getTimestamp(), timestampRegex);

        validateField("price", price.getPrice());
    }

    public static void validateFields(ProductReview review) {

    }

    public static void validateFields(ProductVariant variant) {

        if(variant == null)
            throw new NullPointerException("Product variant is NULL!");

        validateField("variant id", variant.getId());

        validateField("variant product id", variant.getProductId());

        validateField("variant quantity", variant.getQuantity());

        validateField("variant attribute id", variant.getAttributeId());

        validateField("variant value id", variant.getValueId());
    }

    public static void validateFields(ProductVariantAttribute attribute) {

        if(attribute == null)
            throw new NullPointerException("Product variant attribute is NULL!");

        validateField("variant attribute id", attribute.getId());

        validateField("variant attribute name", attribute.getName(), nameRegex);
    }

    public static void validateFields(ProductVariantValue value) {

        if(value == null)
            throw new NullPointerException("Product variant value is NULL!");

        validateField("variant value id", value.getId());

        validateField("variant value name", value.getName(), nameRegex);
    }

    private static void validateField(String fieldName, String fieldValue, String regex) {

        if(fieldValue == null)
            throw new NullPointerException(String.format("Product %s is NULL!", fieldName));

        if(!fieldValue.matches(regex))
            throw new IllegalArgumentException(String.format("Product %s isn't valid! Value: %s", fieldName, fieldValue));
    }

    private static void validateField(String fieldName, int fieldValue) {

        if(fieldValue <= 0)
            throw new IllegalArgumentException(String.format("Product %s isn't valid! Value: %d", fieldName, fieldValue));
    }

    private static void validateField(String fieldName, double fieldValue) {

        if(fieldValue <= 0)
            throw new IllegalArgumentException(String.format("Product %s isn't valid! Value: %.2f", fieldName, fieldValue));
    }

    //public static void checkUniqueField(String fieldName, String fieldValue, Funtion repoCheckFuntion);
}
