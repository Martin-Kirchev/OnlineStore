package User;

import util.BaseRepository;

public class UserRepository extends BaseRepository<User> {

    public UserRepository() {}

    public User findUserByEmail(String userEmail) {
        return this.getStream()
                    .filter(user -> user.getEmail().equals(userEmail))
                    .findFirst()
                    .orElse(null);
    }

}
