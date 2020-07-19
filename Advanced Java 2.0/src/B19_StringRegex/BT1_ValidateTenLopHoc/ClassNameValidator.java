package B19_StringRegex.BT1_ValidateTenLopHoc;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassNameValidator {
    private static Pattern pattern;
    private Matcher matcher;

    private static final String CLASS_NAME_REGEX = "^[CAP][\\d]{4}[GHIKLM]$";

    public ClassNameValidator() {
        pattern = Pattern.compile(CLASS_NAME_REGEX);
    }

    public boolean validate(String regex) {
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
