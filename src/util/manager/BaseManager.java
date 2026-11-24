package util.manager;

import util.entity.BaseEntity;
import util.repository.BaseRepository;
import util.validator.ValidatorManager;

public abstract class BaseManager<T extends BaseEntity> {

    private final BaseRepository<T> repository;
    private final ValidatorManager<T> validator;

    public BaseManager(BaseRepository<T> repository, ValidatorManager<T> validator) {

        this.repository = repository;
        this.validator = validator;
    }

    public void add(String className, T instance) {

        if(!repository.add(instance))
            throw new RuntimeException(String.format("%s wasn't added to the repository!", className));
    }

    public void remove(String className, T instance) {

        if(!repository.remove(instance.getId()))
            throw new RuntimeException(String.format("%s wasn't removed to the repository!", className));
    }

    public void validate(T instance) {
        validator.validate(instance);
    }

    public void checkId(String className, int id) {

        if(repository.findById(id) != null)
            throw new IllegalArgumentException(String.format("%s with this id already exists!", className));
    }

}
