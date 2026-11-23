package category;

import util.repository.BaseRepository;

public class CategoryRepository extends BaseRepository<Category> {

    public CategoryRepository() {}

    public Category findByName(String categoryName) {
        return this.getStream()
                    .filter(category -> category.getName().equals(categoryName))
                    .findFirst()
                    .orElse(null);
    }

}