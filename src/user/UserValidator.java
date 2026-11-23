package user;

import util.validator.BaseValidator;

public class UserValidator extends BaseValidator<User> {

    private static final String nameRegex = "[A-Z][a-z]+";
    private static final String addressRegex = "[A-Za-z0-9.]+";
    private static final String emailRegex = "[A-Za-z0-9]+[.]?[A-Za-z0-9]+[@]{1}[A-Za-z]+[.][a-z]+";
    private static final String passwordRegex = "[a-zA-Z0-9\\S]{8,}";

    @Override
    public void validate(User user) {

        isNotNull("User", user);

        validateField("User id", user.getId());

        validateField("User firstName", user.getFirstName(), nameRegex);

        validateField("User lastName", user.getLastName(), nameRegex);

        validateField("User address", user.getAddress(), addressRegex);

        validateField("User email", user.getEmail(), emailRegex);

        validateField("User password", user.getPassword(), passwordRegex);
    }

}