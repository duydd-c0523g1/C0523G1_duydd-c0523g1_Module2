package ss16_io_text_file.bai_tap;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadCSVFile {
    public static void main(String[] args) {
        final String FILE_PATH = "D:\\CodeGym\\Git\\C0523G1-duydd-co523g1_Module2\\duy\\src\\ss16_io_text_file\\bai_tap\\countries.csv";
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(FILE_PATH));
            System.out.println("Danh sách các quốc gia:");
            String line;
            while ((line = reader.readLine()) != null) {
                String[] countryData = line.split(",");
                int id = Integer.parseInt(countryData[0]);
                String code = countryData[1];
                String name = countryData[2];
                System.out.println("ID: " + id + ", Code: " + code + ", Name: " + name);
            }
        } catch (IOException ex) {
            System.out.println("Lỗi: Không thể đọc tệp.");
        } catch (NumberFormatException ex) {
            System.out.println("Lỗi: Dữ liệu không hợp lệ trong tệp.");
        } finally {
            try {
                if (reader != null) reader.close();
            } catch (IOException ex) {
                System.out.println("Lỗi: Không thể đóng tệp.");
            }
        }
    }
}
