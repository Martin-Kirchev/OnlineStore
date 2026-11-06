package User;

public class UserValidator {

    private static final String emailRegex = "[A-Za-z0-9]+[.]?[A-Za-z0-9]+[@]{1}[A-Za-z]+[.][a-z]+";
    private static final String passwordRegex = "[a-zA-Z0-9\\S]{8,}";

    public static void validateUser(User user) {

        if(user.getFirstName() == null) {

            throw new NullPointerException("First name is NULL!");
        }

        if(user.getLastName() == null) {

            throw new NullPointerException("Last name is NULL!");
        }

        if(user.getAddress() == null) {

            throw new NullPointerException("Address name is NULL!");
        }

        try {
            validateEmail(user.getEmail());
        } catch (Exception e) {


        }

        try {
            validatePassword(user.getPassword());
        } catch (Exception e) {


        }
    }

    private static void validateEmail(String email) {

        if(!email.matches(emailRegex)) {

            throw new IllegalArgumentException("Email isn't valid!");
        }
    }

    private static void validatePassword(String password) {

        if(!password.matches(passwordRegex)) {

            throw new IllegalArgumentException("Password isn't valid!");
        }
    }

}
