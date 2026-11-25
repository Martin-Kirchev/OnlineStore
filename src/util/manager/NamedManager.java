package util.manager;

import util.entity.NamedEntity;
import util.repository.NamedRepository;
import util.validator.ValidatorManager;

public abstract class NamedManager<T extends NamedEntity, R extends NamedRepository<T>> extends BaseManager<T, R> {

    public NamedManager(R repository, ValidatorManager<T> validator) {
        super(repository, validator);
    }

    public void checkName(String className, String name) {

        if(this.getRepository().findByName(name) != null)
            throw new IllegalArgumentException(String.format("%s with this name already exists!", className));
    }

}
