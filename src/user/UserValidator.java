package user;

import util.validator.BaseValidator;
import util.validator.RegexList;

public class UserValidator extends BaseValidator<User> {

    @Override
    public void validate(User user) {

        isNotNull("User", user);

        validateField("User id", user.getId());

        validateField("User firstName", user.getFirstName(), RegexList.userName);

        validateField("User lastName", user.getLastName(), RegexList.userName);

        validateField("User address", user.getAddress(), RegexList.userAddress);

        validateField("User email", user.getEmail(), RegexList.userEmail);

        validateField("User password", user.getPassword(), RegexList.userPassword);
    }

}