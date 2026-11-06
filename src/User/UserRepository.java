package User;

import java.util.LinkedList;

public class UserRepository {

    LinkedList<User> userDB;

    public UserRepository() {
        this.userDB = new LinkedList<>();
    }

    public void addUser(User user) {
        userDB.add(user);
    }

    public void removeUser(User user) {
        userDB.remove(user);
    }

    public User findUserById(int id) {

        for(User user : userDB) {

            if(user.getId() == id)
                return user;
        }

        return null;
    }

    public User findUserByEmail(String email) {

        for(User user : userDB) {

            if(user.getEmail().equals(email))
                return user;
        }

        return null;
    }

}
