package util.validator;

import util.entity.BaseEntity;

public class ValidatorManager<T extends BaseEntity> {

    private final BaseValidator<T> validator;

    public ValidatorManager(BaseValidator<T> validator) {

        this.validator = validator;
    }

    public void validate(T instance) {
        validator.validate(instance);
    }

    public boolean isNull() {
        return this.validator == null;
    }

}
