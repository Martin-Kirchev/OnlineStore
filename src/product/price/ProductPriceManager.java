package product.price;

import util.manager.BaseManager;
import util.validator.ValidatorManager;

public class ProductPriceManager extends BaseManager<ProductPrice, ProductPriceRepository> {

    public ProductPriceManager() {
        super(new ProductPriceRepository(), new ValidatorManager<>(new ProductPriceValidator()));
    }

    public ProductPrice getCurrentPrice(int productId) {

        ProductPrice price = this.getRepository().findCurrentPrice(productId);

        if(price == null)
            throw new IllegalArgumentException("A product with this id wasn't found!");

        return price;
    }

    public ProductPrice getCheapestPrice(int productId) {

        ProductPrice price = this.getRepository().findCheapestPrice(productId);

        if(price == null)
            throw new IllegalArgumentException("A product with this id wasn't found!");

        return price;
    }

}
