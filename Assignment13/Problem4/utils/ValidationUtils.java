package utils;

public class ValidationUtils {
    public static boolean isValidEmail(String email) {
        return email.matches("^[\\w.-]+@[\\w.-]+\\.\\w+$");
    }

    public static boolean isNumeric(String str) {
        return str.matches("-?\\d+(\\.\\d+)?");
    }

    public static boolean isValidPhone(String phone) {
        return phone.matches("\\d{10}");
    }
}
