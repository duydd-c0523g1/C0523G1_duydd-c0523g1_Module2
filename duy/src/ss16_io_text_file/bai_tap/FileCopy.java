package ss16_io_text_file.bai_tap;

import java.io.*;

public class FileCopy {
    public static void main(String[] args) {
        BufferedReader reader = null;
        BufferedWriter writer = null;
        try {
            // Nhập tên tệp nguồn và tệp đích từ người dùng
            BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Nhập tên tệp nguồn: ");
            String sourceFile = userInput.readLine();
            System.out.print("Nhập tên tệp đích: ");
            String targetFile = userInput.readLine();
            // Mở tệp nguồn và tệp đích
            reader = new BufferedReader(new FileReader(sourceFile));
            writer = new BufferedWriter(new FileWriter(targetFile));
            // Sao chép dữ liệu từ tệp nguồn sang tệp đích
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }
            // Đóng tệp nguồn và tệp đích
            reader.close();
            writer.close();
            // Đếm số ký tự trong tệp nguồn
            int charCount = countCharacters(sourceFile);
            System.out.println("Số ký tự trong tệp nguồn: " + charCount);
            System.out.println("Sao chép tệp thành công.");
        } catch (FileNotFoundException ex) {
            System.out.println("Lỗi: Tệp nguồn không tồn tại.");
        } catch (IOException ex) {
            System.out.println("Lỗi: Không thể đọc/ghi tệp.");
        } finally {
            try {
                if (reader != null) reader.close();
                if (writer != null) writer.close();
            } catch (IOException ex) {
                System.out.println("Lỗi: Không thể đóng tệp.");
            }
        }
    }

    private static int countCharacters(String fileName) throws IOException {
        BufferedReader reader = null;
        int charCount = 0;
        try {
            reader = new BufferedReader(new FileReader(fileName));
            int character;
            while ((character = reader.read()) != -1) {
                charCount++;
            }
        } finally {
            if (reader != null) reader.close();
        }
        return charCount;
    }
}

