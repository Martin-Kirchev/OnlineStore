package User;

import java.util.LinkedList;

public class User   {

    private final int id;
    private String firstName;
    private String lastName;
    private String address;
    private String email;
    private String password;
    private LinkedList<Integer> roleIDs;

    public User(int id, String lastName, String firstName,
                String password, String email, String address) {

        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.roleIDs = new LinkedList<>();
        this.password = password;
        this.email = email;
        this.address = address;
    }

    public int getId() {
        return id;
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

    public void addRole(int roleID) {

        roleIDs.add(roleID);
    }

    public void removeRole(int roleID) {

        int size = roleIDs.size();

        for (int i = 0; i < size; i++) {

            if(roleIDs.get(i) == roleID){

                roleIDs.remove(i);
                return;
            }
        }
    }

    public boolean haveRole(int roleID) {

        int size = roleIDs.size();

        for (Integer ID : roleIDs) {

            if (ID == roleID)
                return true;
        }

        return false;
    }
}
