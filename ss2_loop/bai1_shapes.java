import java.util.Scanner;
public class bai1_shapes {
    public static void main(String[] args) {

        System.out.println("Nhập 1 để vẽ hình chữ nhật");
        System.out.println("Nhập 2 để vẽ hình tam giác vuông bottom-left");
        System.out.println("Nhập 3 để vẽ hình tam giác vuông top-right");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();


        if (input == 1) {
            for (int i = 0; i < 3; i++) {
                System.out.println();
                for (int j = 0; j < 8; j++) {
                    System.out.print("* ");
                }
            }
        }
    }
}
