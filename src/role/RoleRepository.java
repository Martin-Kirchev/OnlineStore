package role;

import util.BaseRepository;

public class RoleRepository extends BaseRepository<Role> {

    public RoleRepository() {}

    public Role findRoleByName(String roleName) {
        return this.getStream()
                    .filter(role -> role.getName().equals(roleName))
                    .findFirst()
                    .orElse(null);
    }

}
