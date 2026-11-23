package util;

public interface Validator<T extends BaseEntity> {

    void validate(T instance);

}
