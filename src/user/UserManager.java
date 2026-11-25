package user;

import util.manager.BaseManager;
import util.validator.ValidatorManager;

public class UserManager extends BaseManager<User, UserRepository> {

    public UserManager() {
        super(new UserRepository(), new ValidatorManager<>(new UserValidator()));
    }

    public void checkEmail(String email) {

        if(this.getRepository().findByEmail(email) != null)
            throw new IllegalArgumentException("User with this email already exists!");
    }

}
