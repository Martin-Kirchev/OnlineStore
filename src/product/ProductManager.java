package product;

import util.manager.NamedManager;
import util.validator.ValidatorManager;

import java.util.Set;

public class ProductManager extends NamedManager<Product, ProductRepository> {

    public ProductManager(ProductRepository repository, ValidatorManager<Product> validator) {
        super(repository, validator);
    }

    public void checkIds(Set<Integer> ids) {

        if (!ids.stream().allMatch(id -> this.getRepository().findById(id) != null))
            throw new IllegalArgumentException("A product id was not found!");
    }

}
