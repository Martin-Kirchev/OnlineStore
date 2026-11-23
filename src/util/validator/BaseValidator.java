package util.validator;

import util.entity.BaseEntity;

public abstract class BaseValidator<T extends BaseEntity> implements Validator<T> {

    public abstract void validate(T instance);


    public void isNotNull(String className, T instance) {

        if(instance == null)
            throw new NullPointerException(String.format("%s is NULL!", className));
    }

    public void isNotNull(String fieldName, String field) {

        if(field == null)
            throw new NullPointerException(String.format("%s is NULL!", fieldName));
    }

    public void validateField(String fieldName, String fieldValue, String regex) {

        isNotNull(fieldName, fieldValue);

        if(!fieldValue.matches(regex))
            throw new IllegalArgumentException(String.format("%s isn't valid! Value: %s", fieldName, fieldValue));
    }

    public void validateField(String fieldName, int fieldValue) {

        if(fieldValue <= 0)
            throw new IllegalArgumentException(String.format("%s isn't valid! Value: %d", fieldName, fieldValue));
    }

    public void validateField(String fieldName, double fieldValue) {

        if(fieldValue <= 0)
            throw new IllegalArgumentException(String.format("%s isn't valid! Value: %.2f", fieldName, fieldValue));
    }

}
