package User;

import java.util.LinkedList;

public class UserRepository {

    LinkedList<User> userDB;

    public UserRepository() {
        this.userDB = new LinkedList<>();
    }

    public boolean addUser(User user) {
        return userDB.add(user);
    }

    public boolean removeUser(int userId) {
        return userDB.removeIf(user -> user.getId() == userId);
    }

    public User findUserById(int userId) {
        return userDB.stream()
                        .filter(user -> user.getId() == userId)
                        .findFirst()
                        .orElse(null);
    }

    public User findUserByEmail(String userEmail) {
        return userDB.stream()
                        .filter(user -> user.getEmail().equals(userEmail))
                        .findFirst()
                        .orElse(null);
    }

}
