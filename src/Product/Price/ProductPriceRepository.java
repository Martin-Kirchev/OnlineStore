package Product.Price;

import java.util.Comparator;
import java.util.LinkedList;

public class ProductPriceRepository {

    LinkedList<ProductPrice> priceDB;

    public ProductPriceRepository() {

        this.priceDB = new LinkedList<>();
    }

    public boolean addProductPrice(ProductPrice productPrice) {
        return priceDB.add(productPrice);
    }

    public boolean removeProductPrice(int priceId) {
        return priceDB.removeIf(productPrice -> productPrice.getId() == priceId);
    }

    /** Това може да се замени със заявка! */
    public ProductPrice findCurrentProductPrice(int productId) {

        return priceDB.stream()
                        .filter(productPrice -> productPrice.getProductId() == productId)
                        .max(Comparator.comparing(ProductPrice::getTimestamp))
                        .orElse(null);
    }

    /** Това може да се замени със заявка! */
    public ProductPrice findCheapestProductPrice(int productId) {

        return priceDB.stream()
                        .filter(productPrice -> productPrice.getProductId() == productId)
                        .min(Comparator.comparingDouble(ProductPrice::getPrice))
                        .orElse(null);
    }

    public ProductPrice findPriceByProductIdAndTimestamp(int productId, String timestamp) {

        return priceDB.stream()
                        .filter(price -> price.getProductId() == productId
                                                        && price.getTimestamp().equals(timestamp))
                        .findFirst()
                        .orElse(null);
    }

}