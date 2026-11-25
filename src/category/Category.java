package category;

import util.entity.NamedEntity;

import java.util.HashSet;
import java.util.Set;

public class Category extends NamedEntity {

    private final Set<Integer> innerCategoryIDs;
    private final Set<Integer> productIDs;

    public Category(int id, String name) {

        this.setId(id);
        this.setName(name);
        this.innerCategoryIDs = new HashSet<>();
        this.productIDs = new HashSet<>();
    }

    public Set<Integer> getInnerCategoryIDs() {
        return innerCategoryIDs;
    }

    public Set<Integer> getProductIDs() {
        return productIDs;
    }

    public boolean addInnerCategory(int categoryID) {
        return innerCategoryIDs.add(categoryID);
    }

    public boolean removeInnerCategory(int categoryID) {
        return innerCategoryIDs.removeIf(id -> id == categoryID);
    }

    public boolean haveCategory(int categoryID) {
        return innerCategoryIDs.contains(categoryID);
    }

    public boolean addProduct(int productID) {
        return productIDs.add(productID);
    }

    public boolean removeProduct(int productID) {
        return productIDs.removeIf(id -> id == productID);
    }

    public boolean haveProduct(int productID) {
        return productIDs.contains(productID);
    }

}
