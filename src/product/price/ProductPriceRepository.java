package product.price;

import util.BaseRepository;

import java.util.Comparator;

public class ProductPriceRepository extends BaseRepository<ProductPrice> {

    public ProductPriceRepository() {}

    public ProductPrice findCurrentProductPrice(int productId) {

        return this.getStream()
                    .filter(productPrice -> productPrice.getProductId() == productId)
                    .max(Comparator.comparing(ProductPrice::getTimestamp))
                    .orElse(null);
    }

    public ProductPrice findCheapestProductPrice(int productId) {

        return this.getStream()
                    .filter(productPrice -> productPrice.getProductId() == productId)
                    .min(Comparator.comparingDouble(ProductPrice::getPrice))
                    .orElse(null);
    }

}