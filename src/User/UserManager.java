package User;

public class UserManager {

    UserRepository repository;

    public UserManager() {

        repository = new UserRepository();
    }

    void addUser(User user) {

        UserValidator.validateUser(user);

        if(repository.findUserByEmail(user.getEmail()) != null)
            throw new IllegalArgumentException("User already exists!");

        if(!repository.addUser(user))
            throw new RuntimeException("User wasn't to the repository!");
    }

    void removeUser(int userId) {

        if(!repository.removeUser(userId))
            throw new IllegalArgumentException("User wasn't found!");
    }

}
