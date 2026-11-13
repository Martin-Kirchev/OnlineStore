package User;

import Role.RoleRepository;

public class UserManager {

    UserRepository userRepo;
    RoleRepository roleRepo;

    public UserManager() {

        this.userRepo = new UserRepository();
        this.roleRepo = new RoleRepository();
    }

    public void addUser(User user) {

        UserValidator.validateUserFields(user);

        if(userRepo.findUserByEmail(user.getEmail()) != null)
            throw new IllegalArgumentException("User already exists!");

        UserValidator.validateUserRoles(user, roleRepo);

        if(!userRepo.addUser(user))
            throw new RuntimeException("User wasn't added to the repository!");
    }

    public void removeUser(int userId) {

        if(!userRepo.removeUser(userId))
            throw new IllegalArgumentException("User wasn't found!");
    }

}
