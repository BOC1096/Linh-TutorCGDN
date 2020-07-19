package B19_StringRegex.BT2_ValidateSoDienThoai;

public class ValidatePhoneNumber {
    public static void main(String[] args) {
        PhoneNumberValidator phoneNumberValidator = new PhoneNumberValidator();
        
        System.out.println(phoneNumberValidator.validate("(84)-(0978489648)"));
        System.out.println(phoneNumberValidator.validate("(a8)-(22222222)"));
    }
}
