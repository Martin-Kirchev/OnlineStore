package category;

import util.BaseRepository;

public class CategoryRepository extends BaseRepository<Category> {

    public CategoryRepository() {}

    public Category findCategoryByName(String categoryName) {
        return this.getStream()
                    .filter(category -> category.getName().equals(categoryName))
                    .findFirst()
                    .orElse(null);
    }

}