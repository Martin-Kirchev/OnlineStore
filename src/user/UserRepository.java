package user;

import util.repository.BaseRepository;

public class UserRepository extends BaseRepository<User> {

    public UserRepository() {}

    public User findByEmail(String userEmail) {
        return this.getStream()
                    .filter(user -> user.getEmail().equals(userEmail))
                    .findFirst()
                    .orElse(null);
    }

}
