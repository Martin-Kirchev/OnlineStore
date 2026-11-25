package product.review;

import util.validator.BaseValidator;
import util.validator.RegexList;

public class ProductReviewValidator extends BaseValidator<ProductReview> {

    @Override
    public void validate(ProductReview review) {

        isNotNull("Review", review);

        validateField("Review user id", review.getUserId());

        validateField("Review product id", review.getProductId());

        validateField("Review rating", review.getRating());

        validateField("Review description", review.getDescription(), RegexList.reviewDescription);

        validateField("Review timestamp", review.getTimestamp(), RegexList.timestamp);
    }

}
