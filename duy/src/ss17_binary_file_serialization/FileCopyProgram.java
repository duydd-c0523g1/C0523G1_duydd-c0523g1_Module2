package ss17_binary_file_serialization;

import java.io.*;

public class FileCopyProgram {

    public static void main(String[] args) {
        String sourceFilePath = "path/to/source/file.txt";
        String targetFilePath = "path/to/target/file.txt";
        try {
            if (checkSourceFileExists(sourceFilePath) && !checkTargetFileExists(targetFilePath)) {
                copyFile(sourceFilePath, targetFilePath);
                displayFileSize(targetFilePath);
            }
        } catch (IOException e) {
            System.out.println("Lỗi: Không thể sao chép tệp.");
        }
    }

    private static void copyFile(String sourceFilePath, String targetFilePath) throws IOException {
        try (FileInputStream fis = new FileInputStream(sourceFilePath);
             FileOutputStream fos = new FileOutputStream(targetFilePath)) {
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }
        }
    }

    private static boolean checkSourceFileExists(String sourceFilePath) {
        File sourceFile = new File(sourceFilePath);
        if (!sourceFile.exists()) {
            System.out.println("Lỗi: Tệp nguồn không tồn tại.");
            return false;
        }
        return true;
    }

    private static boolean checkTargetFileExists(String targetFilePath) {
        File targetFile = new File(targetFilePath);
        if (targetFile.exists()) {
            System.out.println("Lỗi: Tệp đích đã tồn tại.");
            return true;
        }
        return false;
    }

    private static void displayFileSize(String targetFilePath) {
        File targetFile = new File(targetFilePath);
        long fileSize = targetFile.length();
        System.out.println("Sao chép tệp thành công.");
        System.out.println("Số byte trong tệp đích: " + fileSize);
    }
}

