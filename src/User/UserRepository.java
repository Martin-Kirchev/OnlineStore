package User;

import java.util.LinkedList;
import java.util.Objects;

public class UserRepository {

    LinkedList<User> userDB;

    UserRepository() {
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

    public User findUserByName(String name) {

        for(User user : userDB) {

            if(user.getFirstName().equals(name))
                return user;
        }

        return null;
    }

}
