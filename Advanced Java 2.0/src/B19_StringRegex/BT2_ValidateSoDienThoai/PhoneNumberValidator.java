package B19_StringRegex.BT2_ValidateSoDienThoai;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberValidator {
    private static Pattern pattern;
    private Matcher matcher;

private static final String PHONE_NUMBER_REGEX = "[(][\\d]{2}[)]-[(]0[\\d]{9}[)]";

    public PhoneNumberValidator() {
        pattern = Pattern.compile(PHONE_NUMBER_REGEX);
    }

    public boolean validate(String regex) {
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
