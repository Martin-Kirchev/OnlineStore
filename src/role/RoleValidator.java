package role;

import util.validator.BaseValidator;
import util.validator.RegexList;

public class RoleValidator extends BaseValidator<Role> {

    @Override
    public void validate(Role role) {

        isNotNull("Role", role);

        validateField("Role id", role.getId());

        validateField("Role name", role.getName(), RegexList.baseName);
    }
}
