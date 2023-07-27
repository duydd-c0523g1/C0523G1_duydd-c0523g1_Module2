package ss19_string_regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberValidation {
    public static boolean isValid(String phoneNumber) {
        final String PATTERN = "^\\(\\d{2}\\)-\\(0\\d{9}\\)$";
        Pattern phonePattern = Pattern.compile(PATTERN);
        Matcher matcher = phonePattern.matcher(phoneNumber);
        return matcher.matches();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Số điện thoại cần tuân thủ format: (xx)-(0xxxxxxxxx)\nVí dụ: (84)-(0978489648)\nNhập số điện thoại để kiểm tra: ");
        String phoneNumber = scanner.nextLine();
        isValid(phoneNumber);
        if (isValid(phoneNumber)) {
            System.out.println("Số điện thoại hợp lê");
        } else {
            System.out.println("Số điện thoại không hợp lệ");
        }
    }
}
