package Category;

import Product.Product;

import java.util.LinkedList;

public class CategoryRepository {

    LinkedList<Category> categoryDB;

    public CategoryRepository() {

        categoryDB = new LinkedList<>();
    }

    public void addCategory(Category category) {

        categoryDB.add(category);
    }

    public void removeCategory(Category category) {

        categoryDB. remove(category);
    }

    public Category findCategoryById(int id) {

        for(Category category : categoryDB) {

            if(category.getId() == id)
                return category;
        }

        return null;
    }

    public Category findCategoryByName(String name) {

        for(Category category : categoryDB) {

            if(category.getName().equals(name))
                return category;
        }

        return null;
    }

}
