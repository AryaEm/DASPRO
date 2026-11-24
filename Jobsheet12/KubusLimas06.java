package Jobsheet12;

import java.util.Scanner;

public class KubusLimas06 {
    static int luasPersegi(int s) {
        return s * s;
    }

    static int volumeKubus(int s) {
        return s * s * s;
    }

    static int luasPermukaanKubus(int s) {
        return 6 * luasPersegi(s);
    }

    static double volumeLimasPersegi(int s, int t) {
        return luasPersegi(s) * t / 3.0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n===== MENU PERHITUNGAN =====");
            System.out.println("1. Luas Persegi");
            System.out.println("2. Volume Kubus");
            System.out.println("3. Luas Permukaan Kubus");
            System.out.println("4. Volume Limas Persegi");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan sisi: ");
                    int s1 = sc.nextInt();
                    System.out.println("Luas persegi = " + luasPersegi(s1));
                    break;
                case 2:
                    System.out.print("Masukkan sisi: ");
                    int s2 = sc.nextInt();
                    System.out.println("Volume kubus = " + volumeKubus(s2));
                    break;
                case 3:
                    System.out.print("Masukkan sisi: ");
                    int s3 = sc.nextInt();
                    System.out.println("Luas permukaan kubus = " + luasPermukaanKubus(s3));
                    break;
                case 4:
                    System.out.print("Masukkan sisi alas: ");
                    int s4 = sc.nextInt();
                    System.out.print("Masukkan tinggi: ");
                    int t4 = sc.nextInt();
                    System.out.printf("Volume limas persegi = %.2f\n", volumeLimasPersegi(s4, t4));
                    break;
                case 0:
                    System.out.println("Terima kasih.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);

        sc.close();
    }
}