package Category;

import java.util.HashSet;
import java.util.Set;

public class Category {

    private int id;
    private String name;
    private Set<Integer> innerCategoryIDs;
    private Set<Integer> productIDs;

    public Category(int id, String name) {

        this.id = id;
        this.name = name;
        this.innerCategoryIDs = new HashSet<>();
        this.productIDs = new HashSet<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
