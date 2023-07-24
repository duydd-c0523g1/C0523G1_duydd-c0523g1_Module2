package ss13_searching_algorithm.bai_tap;

import java.util.Scanner;

public class TimChuoiTangDanCoDoDaiLonNhat {
    public static void main(String[] args) {
        String string;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi ký tự bất kỳ");
        string = scanner.nextLine();
        find(string);
    }
    public static String find(String string) {
        String input = string;
        String newString = "";
        int firstCharacter = string.charAt(0);
        int character;
        for (int i = 0; i < string.length(); i++) {
            character = string.charAt(i);
            if (character >= firstCharacter) {
                firstCharacter = character;
                newString += string.charAt(i);
            }
        }
        System.out.println(newString);
        return newString;
    }
}
