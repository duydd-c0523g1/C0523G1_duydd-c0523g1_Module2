package ss19_string_regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassNameValidation {
    public static boolean isValid(String className) {
        final String PATTERN = "^[CAP][0-9]{4}[GHIK]$";
        Pattern classPattern = Pattern.compile(PATTERN);
        Matcher matcher = classPattern.matcher(className);
        return matcher.matches();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tên một lớp học hợp lệ cần đạt các yêu cầu sau:\n" +
                "- Bắt đầu bằng một ký tự chữ hoa C hoặc A hoặc P\n" +
                "- Không chứa các ký tự đặc biệt\n" +
                "- Theo sau ký tự bắt đầu là 4 ký tự số\n" +
                "- Kết thúc phải là 1 trong những ký tự chữ hoa sau: G, H, I, K");
        System.out.print("Nhập tên lớp để kiểm tra: ");
        String className = scanner.nextLine();
        isValid(className);
        if (isValid(className)) {
            System.out.println("Hợp lệ");
        } else {
            System.out.println("Không hợp lệ");
        }
    }
}
