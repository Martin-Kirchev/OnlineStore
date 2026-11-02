package User;

public class UserValidator {

    private static final String emailRegex = "[A-Za-z0-9]+[.]?[A-Za-z0-9]+[@]{1}[A-Za-z]+[.][a-z]+";
    private static final String passwordRegex = "[a-zA-Z0-9\\S]{8,}";

    public static boolean validate(User user) {

        if(user.getFirstName() == null) {

            throw new NullPointerException("First name is NULL!");
        }

        if(user.getLastName() == null) {

            throw new NullPointerException("Last name is NULL!");
        }

        if(user.getAddress() == null) {

            throw new NullPointerException("Address name is NULL!");
        }

        if(!validateEmail(user.getEmail())) {

            throw new IllegalArgumentException("Email isn't valid!");
        }

        if(!validatePassword(user.getPassword())) {

            throw new IllegalArgumentException("Password isn't valid!");
        }

        return true;
    }

    private static boolean validateEmail(String email) {

        return email.matches(emailRegex);
    }

    private static boolean validatePassword(String password) {

        return password.matches(passwordRegex);
    }

}
