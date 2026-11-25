package role;

import util.manager.BaseManager;
import util.validator.ValidatorManager;

import java.util.Set;

public class RoleManager extends BaseManager<Role, RoleRepository> {

    public RoleManager() {
        super(new RoleRepository(), new ValidatorManager<>(new RoleValidator()));
    }

    public void checkIds(Set<Integer> ids) {

        if (!ids.stream().allMatch(id -> this.getRepository().findById(id) != null))
            throw new IllegalArgumentException("A role id was not found!");
    }

}
