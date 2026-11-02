package User;

import java.util.LinkedList;

public class User   {

    private int id;
    private String firstName;
    private String lastName;
    private String address;
    private String email;
    private String password;
    private LinkedList<Integer> roleIDs;

    public User(int id, String lastName, String firstName, LinkedList<Integer> roleIDs,
                String password, String email, String address) {

        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.roleIDs = roleIDs;
        this.password = password;
        this.email = email;
        this.address = address;
    }

    protected int getID(){

        return this.id;
    }

    public int getId() {
        return id;
    }

    protected void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    protected void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    protected void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    protected void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    protected void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    protected void setPassword(String password) {
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

    public boolean hasRole(int roleID) {

        int size = roleIDs.size();

        for (Integer ID : roleIDs) {

            if (ID == roleID)
                return true;
        }

        return false;
    }
}
