package user;

import util.BaseRepository;

public class UserRepository extends BaseRepository<User> {

    public UserRepository() {}

    public User findByEmail(String userEmail) {
        return this.getStream()
                    .filter(user -> user.getEmail().equals(userEmail))
                    .findFirst()
                    .orElse(null);
    }

}
