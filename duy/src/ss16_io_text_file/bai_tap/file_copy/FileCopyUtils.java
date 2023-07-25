package ss16_io_text_file.bai_tap.file_copy;

import java.io.*;

public class FileCopyUtils {
    public static int countCharacters(String fileName) throws IOException {
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
