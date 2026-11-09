package Role;

import java.util.LinkedList;

public class RoleRepository {

    LinkedList<Role> roleDB;

    public RoleRepository() {
        
        this.roleDB = new LinkedList<>();
    }

    public boolean addRole(Role role) {
        return roleDB.add(role);
    }

    public boolean removeRole(int roleId) {
        return roleDB.removeIf(role -> role.getId() == roleId);
    }

    public Role findRoleById(int roleId) {
        return roleDB.stream().filter(role -> role.getId() == roleId).findFirst().orElse(null);
    }

    public Role findRoleByName(String roleName) {
        return roleDB.stream().filter(role -> role.getName().equals(roleName)).findFirst().orElse(null);
    }

}
