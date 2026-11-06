package User;

import java.security.InvalidParameterException;

public class UserService {

    UserRepository repository;

    public UserService() {

        repository = new UserRepository();
    }

    void addUser(User user) {

        try{
            UserValidator.validateUser(user);
        }
        catch (Exception e) {

            throw new InvalidParameterException("User isn't valid!");
        }

        if(repository.findUserByEmail(user.getEmail()) == null) {

            throw new IllegalArgumentException("User doesn't exist!");
        }

        repository.addUser(user);
    }

    void removeUser(User user) {

        if(repository.findUserByEmail(user.getEmail()) == null) {

            throw new IllegalArgumentException("User doesn't exist!");
        }

        repository.removeUser(user);
    }


}
