package category;

import util.manager.NamedManager;
import util.validator.ValidatorManager;

import java.util.Set;

public class CategoryManager extends NamedManager<Category, CategoryRepository> {

    public CategoryManager() {
        super(new CategoryRepository(), new ValidatorManager<>(new CategoryValidator()));
    }

    public Set<Integer> getInnerCategories(int categoryId) {

        Set<Integer> categories = this.getRepository().findInnerCategories(categoryId);

        if(categories == null)
            throw new IllegalArgumentException("A category with this id doesn't exist!");

        return categories;
    }

    public void checkInnerCategories(Set<Integer> ids) {

        if (!ids.stream().allMatch(id -> this.getRepository().findById(id) != null))
            throw new IllegalArgumentException("A category id was not found!");
    }

}
