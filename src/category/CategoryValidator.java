package category;

import util.validator.BaseValidator;
import util.validator.RegexList;

public class CategoryValidator extends BaseValidator<Category> {

    @Override
    public void validate(Category category) {

        isNotNull("Category", category);

        validateField("Category id", category.getId());

        validateField("Category name", category.getName(), RegexList.baseName);
    }
}
