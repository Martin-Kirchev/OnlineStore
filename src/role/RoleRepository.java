package role;

import util.repository.BaseRepository;

public class RoleRepository extends BaseRepository<Role> {

    public RoleRepository() {}

    public Role findByName(String roleName) {
        return this.getStream()
                    .filter(role -> role.getName().equals(roleName))
                    .findFirst()
                    .orElse(null);
    }

}
