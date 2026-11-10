package Product.Price;

import java.util.LinkedList;

public class ProductPriceRepository {

    LinkedList<ProductPrice> priceDB;

    public ProductPriceRepository() {

        this.priceDB = new LinkedList<>();
    }

    public boolean addProductPrice(ProductPrice productPrice) {
        return priceDB.add(productPrice);
    }

    public boolean removeProductPrice(int productId, String productPriceTimestamp) {
        return priceDB.removeIf(productPrice -> productPrice.getProductId() == productId
                                                                && productPrice.getTimestamp().equals(productPriceTimestamp));
    }

    /** Това може да се замени със заявка! */
    public ProductPrice findCurrentProductPrice(int productId) {

        return priceDB.stream()
                        .filter(productPrice -> productPrice.getProductId() == productId)
                        .max((price1, price2) -> price1.getTimestamp().compareTo(price2.getTimestamp()))
                        .orElse(null);
    }

    /** Това може да се замени със заявка! */
    public ProductPrice findCheapestProductPrice(int productId) {

        return priceDB.stream()
                        .filter(productPrice -> productPrice.getProductId() == productId)
                        .min( (price1, price2) -> Double.compare(price1.getPrice(), price2.getPrice()))
                        .orElse(null);
    }

}