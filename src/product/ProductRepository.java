package product;

import util.repository.BaseRepository;

public class ProductRepository extends BaseRepository<Product> {

    public ProductRepository() {}

    public Product findByName(String productName) {
        return this.getStream()
                    .filter(product -> product.getName().equals(productName))
                    .findFirst()
                    .orElse(null);
    }

}
