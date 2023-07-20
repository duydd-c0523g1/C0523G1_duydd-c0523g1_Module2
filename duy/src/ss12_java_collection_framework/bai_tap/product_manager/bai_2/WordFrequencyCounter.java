package ss12_java_collection_framework.bai_tap.product_manager.bai_2;

import java.util.Scanner;
import java.util.TreeMap;

public class WordFrequencyCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Tạo TreeMap để lưu trữ từng từ và số lượng xuất hiện của nó
        TreeMap<String, Integer> wordFrequencyMap = new TreeMap<>();
        System.out.println("Nhập văn bản (nhập 'exit' để kết thúc):");
        // Đọc dòng đầu tiên
        String line = scanner.nextLine();
        while (!line.equalsIgnoreCase("exit")) {
            // Tách từ trong dòng và đếm tần suất xuất hiện của từ
            String[] words = line.split("\\s+");
            for (String word : words) {
                // Loại bỏ dấu câu và chuyển thành chữ thường
                word = word.replaceAll("[^a-zA-Z]", "").toLowerCase();
                if (!word.isEmpty()) {
                    // Kiểm tra từ có trong TreeMap hay không
                    if (wordFrequencyMap.containsKey(word)) {
                        // Nếu từ đã có trong TreeMap, tăng số lần xuất hiện lên 1
                        int frequency = wordFrequencyMap.get(word);
                        wordFrequencyMap.put(word, frequency + 1);
                    } else {
                        // Nếu từ chưa có trong TreeMap, thêm từ vào và gán số lần xuất hiện là 1
                        wordFrequencyMap.put(word, 1);
                    }
                }
            }
            // Đọc dòng tiếp theo
            line = scanner.nextLine();
        }
        // Hiển thị từng từ và số lượng xuất hiện của nó theo thứ tự trong bảng chữ cái
        System.out.println("Từng từ và số lượng xuất hiện của chúng:");
        for (String word : wordFrequencyMap.keySet()) {
            int frequency = wordFrequencyMap.get(word);
            System.out.println(word + ": " + frequency);
        }
        scanner.close();
    }
}
