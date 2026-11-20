package product;

import util.BaseRepository;

public class ProductRepository extends BaseRepository<Product> {

    public ProductRepository() {}

    public Product findProductByName(String productName) {
        return this.getStream()
                    .filter(product -> product.getName().equals(productName))
                    .findFirst()
                    .orElse(null);
    }

}
