package Category;

import java.util.LinkedList;

public class Category {

    private int id;
    private String name;
    private LinkedList<Integer> categoryIDs;
    private LinkedList<Integer> productIDs;

    public Category(int id, String name) {

        this.id = id;
        this.name = name;
        this.categoryIDs = new LinkedList<>();
        this.productIDs = new LinkedList<>();
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

    public void addInnerCategory(int categoryID) {

        categoryIDs.add(categoryID);
    }

    public void removeInnerCategory(int categoryID) {

        int size = categoryIDs.size();

        for (int i = 0; i < size; i++) {

            if(categoryIDs.get(i) == categoryID){

                categoryIDs.remove(i);
                return;
            }
        }
    }

    public boolean haveCategory(int categoryID) {

        int size = categoryIDs.size();

        for (Integer ID : categoryIDs) {

            if (ID == categoryID)
                return true;
        }

        return false;
    }

    public void addProduct(int productID) {

        productIDs.add(productID);
    }

    public void removeProduct(int productID) {

        int size = productIDs.size();

        for (int i = 0; i < size; i++) {

            if(productIDs.get(i) == productID){

                productIDs.remove(i);
                return;
            }
        }
    }

    public boolean haveProduct(int productID) {

        int size = productIDs.size();

        for (Integer ID : productIDs) {

            if (ID == productID)
                return true;
        }

        return false;
    }

}
