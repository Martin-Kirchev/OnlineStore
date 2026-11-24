package role;

import util.manager.BaseManager;
import util.validator.ValidatorManager;

import java.util.Set;

public class RoleManager extends BaseManager<Role, RoleRepository> {

    private final RoleRepository repository;

    public RoleManager() {
        this(new RoleRepository());
    }

    private RoleManager(RoleRepository repository) {
        super(repository, new ValidatorManager<>(new RoleValidator()));

        this.repository = repository;
    }


    public void checkUniqueIds(Set<Integer> ids) {

        if (!ids.stream().allMatch(id -> repository.findById(id) != null))
            throw new IllegalArgumentException("A role id was not found!");
    }

}
