package user;

import util.entity.BaseEntity;

import java.util.HashSet;
import java.util.Set;

public class User extends BaseEntity {

    private String firstName;
    private String lastName;
    private String address;
    private String email;
    private String password;
    private final Set<Integer> roleIDs;

    public User(int id, String firstName, String lastName, String address, String email, String password) {

        this.setId(id);
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.email = email;
        this.password = password;
        this.roleIDs = new HashSet<>();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean addRole(int roleID) {
        return roleIDs.add(roleID);
    }

    public boolean removeRole(int roleID) {
        return roleIDs.removeIf(id -> id == roleID);
    }

    public boolean haveRole(int roleID) {
        return roleIDs.contains(roleID);
    }

    public Set<Integer> getRoleIDs() {
        return roleIDs;
    }
}
