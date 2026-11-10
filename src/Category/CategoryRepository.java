package Category;

import java.util.LinkedList;

public class CategoryRepository {

    LinkedList<Category> categoryDB;

    public CategoryRepository() {

        categoryDB = new LinkedList<>();
    }

    public boolean addCategory(Category category) {
        return categoryDB.add(category);
    }

    public boolean removeCategory(int categoryId) {
        return categoryDB.removeIf(category -> category.getId() == categoryId);
    }

    public Category findCategoryById(int categoryId) {
        return categoryDB.stream()
                            .filter(category -> category.getId() == categoryId)
                            .findFirst()
                            .orElse(null);
    }

    public Category findCategoryByName(String categoryName) {
        return categoryDB.stream()
                            .filter(category -> category.getName().equals(categoryName))
                            .findFirst()
                            .orElse(null);
    }

}