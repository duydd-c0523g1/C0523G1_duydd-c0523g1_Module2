package ss3_array_method.bai_tap;

import java.util.Scanner;

public class CharFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = "awd1awdoijfdsf oijsad aosdij awdioj87ad asoaw321654jdosiajdaw ajsoasd";
        //Nhập vào ký tự cần kiểm tra
        do {
            System.out.println("Nhập vào ký tự cần kiểm tra");
            char charInput = scanner.nextLine().charAt(0);
            //Duyệt qua String ở trên
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == charInput) {
                    count++;
                }
            }
            System.out.println("Ký tự: " + charInput + " xuất hiện " + count + " lần");
        } while (1 + 1 == 2);
    }
}