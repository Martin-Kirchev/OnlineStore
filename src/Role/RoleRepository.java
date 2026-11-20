package Role;

import util.BaseRepository;

import java.util.LinkedList;

public class RoleRepository extends BaseRepository<Role> {

    public RoleRepository() {}

    public Role findRoleByName(String roleName) {
        return this.getStream()
                    .filter(role -> role.getName().equals(roleName))
                    .findFirst()
                    .orElse(null);
    }

}
