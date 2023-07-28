import java.util.ArrayList;
import java.util.List;

public class NumberGenerator {

    public static void main(String[] args) {
        int n = 3;
        List<String> numbers = generateNumbers(n);
        for (String number : numbers) {
            System.out.println(number);
        }
    }

    public static List<String> generateNumbers(int n) {
        List<String> result = new ArrayList<>();
        generateNumbersHelper("", n, result);
        return result;
    }

    private static void generateNumbersHelper(String currentNumber, int n, List<String> result) {
        // Base case: Nếu currentNumber có độ dài bằng n, thêm nó vào danh sách kết quả
        if (currentNumber.length() == n) {
            result.add(currentNumber);
            return;
        }

        // Đệ quy để tạo các số có độ dài n bằng cách thêm các chữ số [1, 2, 3] vào currentNumber
        for (int i = 1; i <= 3; i++) {
            generateNumbersHelper(currentNumber + i, n, result);
        }
    }
}
