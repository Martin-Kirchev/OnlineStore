package product;

import util.manager.NamedManager;
import util.validator.ValidatorManager;

public class ProductManager extends NamedManager<Product, ProductRepository> {

    public ProductManager(ProductRepository repository, ValidatorManager<Product> validator) {
        super(repository, validator);
    }

}
