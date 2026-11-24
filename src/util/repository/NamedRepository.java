package util.repository;

import util.entity.NamedEntity;

public class NamedRepository<T extends NamedEntity> extends BaseRepository<T> {

    public T findByName(String name) {

        return this.getStream()
                    .filter(instance -> instance.getName().equals(name))
                    .findFirst()
                    .orElse(null);
    }

}
