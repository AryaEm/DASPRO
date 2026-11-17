package Quiz2;

import java.util.Scanner;

public class Pangkat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println();
        System.out.print("Masukkan bilangan n: ");
        int n = input.nextInt();

        System.out.print("Masukkan bilangan m: ");
        int m = input.nextInt();

        int hasil = 1;

        if (m >= 0) {
            for (int i = 1; i <= m; i++) {
                hasil *= n;
            }
        } else {
            for (int i = 1; i <= -m; i++) {
                hasil /= n;
            }
        }

        System.out.println(n + " pangkat " + m + " = " + hasil);
        System.out.println();
    }
}