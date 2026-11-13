package User;

import Role.RoleRepository;

import java.util.Set;

public class UserValidator {

    private static final String nameRegex = "[A-Z][a-z]+";
    private static final String addressRegex = "[A-Za-z0-9.]+";
    private static final String emailRegex = "[A-Za-z0-9]+[.]?[A-Za-z0-9]+[@]{1}[A-Za-z]+[.][a-z]+";
    private static final String passwordRegex = "[a-zA-Z0-9\\S]{8,}";

    public static void validateUserFields(User user) {

        if(user == null)
            throw new NullPointerException("User is NULL!");

        validateUserField("id", user.getId());

        validateUserField("firstName", user.getFirstName(), nameRegex);

        validateUserField("lastName", user.getLastName(), nameRegex);

        validateUserField("address", user.getAddress(), addressRegex);

        validateUserField("email", user.getEmail(), emailRegex);

        validateUserField("password", user.getPassword(), passwordRegex);
    }

    public static void validateUserRoles(User user, RoleRepository roleRepo) {

        Set<Integer> userRoleIDs = user.getRoleIDs();

        for(int role : userRoleIDs) {

            if(role <= 0)
                throw new IllegalArgumentException(String.format("User role isn't valid! Value: %d", role));

            if(roleRepo.findRoleById(role) == null)
                throw new IllegalArgumentException(String.format("User role isn't in RoleRepository! Value: %d", role));
        }
    }

    private static void validateUserField(String fieldName, String parameter, String regex) {

        if(parameter == null)
            throw new NullPointerException(String.format("User %s is NULL!", fieldName));

        if(!parameter.matches(regex))
            throw new IllegalArgumentException(String.format("User %s isn't valid! Value: %s", fieldName, parameter));
    }

    private static void validateUserField(String fieldName, int parameter) {

        if(parameter <= 0)
            throw new IllegalArgumentException(String.format("User %s isn't valid! Value: %d", fieldName, parameter));
    }

}