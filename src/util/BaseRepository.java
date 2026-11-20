package util;

import java.util.LinkedList;
import java.util.stream.Stream;

public abstract class BaseRepository<T extends BaseEntity> {

    private final LinkedList<T> repository = new LinkedList<>();

    public boolean add(T instance) {
        return repository.add(instance);
    }

    public boolean remove(int id) {
        return repository.removeIf(instance -> instance.getId() == id);
    }

    public Stream<T> getStream() {
        return repository.stream();
    }

    public T findById(int id) {

        return repository.stream()
                .filter(instance -> instance.getId() == id)
                .findFirst()
                .orElse(null);
    }

}
