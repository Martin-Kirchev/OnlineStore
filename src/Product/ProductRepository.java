package Product;

import java.util.LinkedList;

public class ProductRepository {

    LinkedList<Product> productDB;

    ProductRepository(){

        this.productDB = new LinkedList<>();
    }

    public void addProduct(Product product) {
        productDB.add(product);
    }

    public void removeProduct(Product product) {
        productDB.remove(product);
    }

    public Product findProductById(int id) {

        for(Product product : productDB) {

            if(product.getId() == id)
                return product;
        }

        return null;
    }

    public Product findProductByName(String name) {

        for(Product product : productDB) {

            if(product.getName().equals(name))
                return product;
        }

        return null;
    }

}
