package util;

public class ValidatorManager {

    private final BaseValidator<BaseEntity> validator;

    public ValidatorManager(BaseValidator<BaseEntity> validator) {

        this.validator = validator;
    }

    public void validate(BaseEntity instance) {

        validator.validate(instance);
    }
}
