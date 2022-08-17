import java.util.Scanner;

public class Buyukten {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("1. sayiyi girin");
        int a = scanner.nextInt();
        System.out.print("2. sayiyi girin");
        int b = scanner.nextInt();
        System.out.print("3. sayiyi girin");
        int c = scanner.nextInt();

        if (a < b) {
            if (a < c) {
                System.out.print("1. sayı en küçüktür.");
            } else if (a > c) {
                System.out.print("3. sayı en küçüktür");
            } else {
                System.out.print("2. sayı en küçüktür");

            }


        }
    }
}
