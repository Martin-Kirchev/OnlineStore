package product.review;

import util.manager.BaseManager;
import util.validator.ValidatorManager;

import java.util.LinkedList;

public class ProductReviewManager extends BaseManager<ProductReview, ProductReviewRepository> {

    public ProductReviewManager(ProductReviewRepository repository, ValidatorManager<ProductReview> validator) {
        super(repository, validator);
    }

    public LinkedList<ProductReview> getUserReviews(int userId) {

        LinkedList<ProductReview> reviews = this.getRepository().findUserReviews(userId);

        if(reviews == null)
            throw new IllegalArgumentException("Reviews from this user id doesn't exist!");

        return reviews;
    }

    public LinkedList<ProductReview> getProductReviews(int productId) {

        LinkedList<ProductReview> reviews = this.getRepository().findProductReviews(productId);

        if(reviews == null)
            throw new IllegalArgumentException("Reviews for this product id doesn't exist!");

        return reviews;
    }

}
