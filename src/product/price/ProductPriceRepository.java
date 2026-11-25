package product.price;

import util.repository.BaseRepository;

import java.util.Comparator;

public class ProductPriceRepository extends BaseRepository<ProductPrice> {

    public ProductPrice findCurrentPrice(int productId) {

        return this.getStream()
                    .filter(productPrice -> productPrice.getProductId() == productId)
                    .max(Comparator.comparing(ProductPrice::getTimestamp))
                    .orElse(null);
    }

    public ProductPrice findCheapestPrice(int productId) {

        return this.getStream()
                    .filter(productPrice -> productPrice.getProductId() == productId)
                    .min(Comparator.comparingDouble(ProductPrice::getPrice))
                    .orElse(null);
    }

}