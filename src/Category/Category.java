package Category;

import java.util.LinkedList;

public class Category {

    private final int id;
    private String name;
    private LinkedList<Integer> categoryIDs;
    private LinkedList<Integer> productIDs;

    Category(int id, String name) {

        this.id = id;
        this.name = name;
        this.categoryIDs = new LinkedList<>();
        this.productIDs = new LinkedList<>();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
