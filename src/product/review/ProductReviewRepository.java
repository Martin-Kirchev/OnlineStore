package product.review;

import util.repository.BaseRepository;

import java.util.LinkedList;
import java.util.stream.Collectors;

public class ProductReviewRepository extends BaseRepository<ProductReview> {

    public LinkedList<ProductReview> findUserReviews(int userId) {

        LinkedList<ProductReview> userReviews = this.getStream()
                                                    .filter(review -> review.getUserId() == userId)
                                                    .collect(Collectors.toCollection(LinkedList::new));

        return userReviews.isEmpty() ? null : userReviews;
    }

    public LinkedList<ProductReview> findProductReviews(int productId) {

        LinkedList<ProductReview> productReviews = this.getStream()
                                                        .filter(review -> review.getProductId() == productId)
                                                        .collect(Collectors.toCollection(LinkedList::new));

        return productReviews.isEmpty() ? null : productReviews;
    }

}
