package Product;

import java.util.LinkedList;

public class ProductRepository {

    LinkedList<Product> productDB;

    public ProductRepository() {

        this.productDB = new LinkedList<>();
    }

    public boolean addProduct(Product product) {
        return productDB.add(product);
    }

    public boolean removeProduct(int productId) {
        return productDB.removeIf(product -> product.getId() == productId);
    }

    public Product findProductById(int productId) {
        return productDB.stream().filter(product -> product.getId() == productId).findFirst().orElse(null);
    }

    public Product findProductByName(String productName) {
        return productDB.stream().filter(product -> product.getName().equals(productName)).findFirst().orElse(null);
    }

}
