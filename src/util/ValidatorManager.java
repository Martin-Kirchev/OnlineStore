package util;

public class ValidatorManager<T extends BaseEntity> {

    private BaseValidator<T> validator;

    public ValidatorManager() {

        this.validator = null;
    }

    public ValidatorManager(BaseValidator<T> validator) {

        this.validator = validator;
    }

    public void setValidator(BaseValidator<T> validator) {

        this.validator = validator;
    }

    public boolean isNull() {

        return this.validator == null;
    }

    public void validate(T instance) {

        validator.validate(instance);
    }
}
