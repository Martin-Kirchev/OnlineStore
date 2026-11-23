package util.validator;

import util.entity.BaseEntity;

public interface Validator<T extends BaseEntity> {

    void validate(T instance);

}
