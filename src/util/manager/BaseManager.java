package util.manager;

import util.entity.BaseEntity;
import util.repository.BaseRepository;
import util.validator.ValidatorManager;

public abstract class BaseManager<T extends BaseEntity, R extends BaseRepository<T>> {

    private final R repository;
    private final ValidatorManager<T> validator;

    public BaseManager(R repository, ValidatorManager<T> validator) {

        this.repository = repository;
        this.validator = validator;
    }

    public R getRepository() {
        return repository;
    }

    public void add(T instance) {

        if(!repository.add(instance))
            throw new RuntimeException(String.format("%s wasn't added to the repository!", instance.getClass().getSimpleName()));
    }

    public void remove(T instance) {

        if(!repository.remove(instance.getId()))
            throw new RuntimeException(String.format("%s wasn't removed to the repository!", instance.getClass().getSimpleName()));
    }

    public void validate(T instance) {
        validator.validate(instance);
    }

    public void checkId(T instance) {

        if(repository.findById(instance.getId()) != null)
            throw new IllegalArgumentException(String.format("%s with this id already exists!", instance.getClass().getSimpleName()));
    }

}
