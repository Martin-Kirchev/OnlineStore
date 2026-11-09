package User;

import java.util.HashSet;
import java.util.Set;

public class User   {

    private int id;
    private String firstName;
    private String lastName;
    private String address;
    private String email;
    private String password;
    private Set<Integer> roleIDs;

    public User(String lastName, String firstName,
                String password, String email, String address) {

        this.id = -1;
        this.lastName = lastName;
        this.firstName = firstName;
        this.roleIDs = new HashSet<>();
        this.password = password;
        this.email = email;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
}
