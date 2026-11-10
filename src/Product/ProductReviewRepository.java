package Product;

import java.util.LinkedList;
import java.util.stream.Collectors;

public class ProductReviewRepository {

    LinkedList<ProductReview> reviewDB;

    public ProductReviewRepository() {

        this.reviewDB = new LinkedList<>();
    }

    public boolean addProductReview(ProductReview review) {
        return reviewDB.add(review);
    }

    public boolean removeProductReview(int reviewId) {
        return reviewDB.removeIf(review -> review.getId() == reviewId);
    }

    public ProductReview findReviewById(int reviewId) {
        return reviewDB.stream().filter(review -> review.getId() == reviewId).findFirst().orElse(null);
    }

    public LinkedList<ProductReview> findUserReviews(int userId) {

        LinkedList<ProductReview> userReviews = reviewDB.stream().filter(review -> review.getUserId() == userId).collect(Collectors.toCollection(LinkedList::new));

        return userReviews.isEmpty() ? null : userReviews;
    }

    public LinkedList<ProductReview> findProductReviews(int productId) {

        LinkedList<ProductReview> productReviews = reviewDB.stream().filter(review -> review.getProductId() == productId).collect(Collectors.toCollection(LinkedList::new));

        return productReviews.isEmpty() ? null : productReviews;
    }

}
