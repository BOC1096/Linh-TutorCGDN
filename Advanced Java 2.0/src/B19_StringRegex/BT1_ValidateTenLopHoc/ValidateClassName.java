package B19_StringRegex.BT1_ValidateTenLopHoc;

public class ValidateClassName {
    public static void main(String[] args) {
        ClassNameValidator classNameValidator = new ClassNameValidator();
        System.out.println(classNameValidator.validate("C0318G"));
        System.out.println(classNameValidator.validate("M0318G"));
        System.out.println(classNameValidator.validate("P0323A"));
    }
}
