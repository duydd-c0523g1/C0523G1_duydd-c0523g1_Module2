import java.util.Scanner;

public class NumToWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số từ 1 đến 999: ");
        int number = scanner.nextInt();
        scanner.close();

        String result = chuyenSoThanhChu(number);
        System.out.println("Kết quả: " + result);
    }

    public static String chuyenSoThanhChu(int number) {
        String text = "";

        if (number == 0) {
            text = "không";
        } else if (number < 20) {
            switch (number) {
                case 1:
                    text = "một";
                    break;
                case 2:
                    text = "hai";
                    break;
                case 3:
                    text = "ba";
                    break;
                case 4:
                    text = "bốn";
                    break;
                case 5:
                    text = "năm";
                    break;
                case 6:
                    text = "sáu";
                    break;
                case 7:
                    text = "bảy";
                    break;
                case 8:
                    text = "tám";
                    break;
                case 9:
                    text = "chín";
                    break;
                case 10:
                    text = "mười";
                    break;
                case 11:
                    text = "mười một";
                    break;
                case 12:
                    text = "mười hai";
                    break;
                case 13:
                    text = "mười ba";
                    break;
                case 14:
                    text = "mười bốn";
                    break;
                case 15:
                    text = "mười năm";
                    break;
                case 16:
                    text = "mười sáu";
                    break;
                case 17:
                    text = "mười bảy";
                    break;
                case 18:
                    text = "mười tám";
                    break;
                case 19:
                    text = "mười chín";
                    break;
            }
        } else if (number < 100) {
            int hangChuc = number / 10;
            int hangDonVi = number % 10;

            text = "mười";
            switch (hangChuc) {
                case 2:
                    text += " hai";
                    break;
                case 3:
                    text += " ba";
                    break;
                case 4:
                    text += " bốn";
                    break;
                case 5:
                    text += " năm";
                    break;
                case 6:
                    text += " sáu";
                    break;
                case 7:
                    text += " bảy";
                    break;
                case 8:
                    text += " tám";
                    break;
                case 9:
                    text += " chín";
                    break;
            }
            if (hangDonVi > 0) {
                text += " " + chuyenSoThanhChu(hangDonVi);
            }
        } else if (number < 1000) {
            int hangTram = number / 100;
            int hangChucDonVi = number % 100;

            switch (hangTram) {
                case 1:
                    text = "một trăm";
                    break;
                case 2:
                    text = "hai trăm";
                    break;
                case 3:
                    text = "ba trăm";
                    break;
                case 4:
                    text = "bốn trăm";
                    break;
                case 5:
                    text = "năm trăm";
                    break;
                case 6:
                    text = "sáu trăm";
                    break;
                case 7:
                    text = "bảy trăm";
                    break;
                case 8:
                    text = "tám trăm";
                    break;
                case 9:
                    text = "chín trăm";
                    break;
            }
            if (hangChucDonVi > 0) {
                text += " " + chuyenSoThanhChu(hangChucDonVi);
            }
        } else {
            text = "Số quá lớn";
        }

        return text;
    }
}
