package category;

import util.repository.NamedRepository;

import java.util.Set;

public class CategoryRepository extends NamedRepository<Category> {

    public Set<Integer> findInnerCategories(int categoryId) {

        return getStream()
                .filter(category -> category.getId() == categoryId)
                .map(Category::getInnerCategoryIDs)
                .findFirst()
                .orElse(null);
    }

}