package Jobsheet11;

import java.util.Scanner;

public class BioskopWithScanner06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int baris, kolom, menu;
        String nama;
        String[][] penonton = new String[4][2];

        do {
            System.out.println("\n===== MENU BIOSKOP =====");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu: ");
            menu = sc.nextInt();
            sc.nextLine();

            if (menu == 1) {
                System.out.print("Masukkan nama: ");
                nama = sc.nextLine();

                while (true) {
                    System.out.print("Masukkan baris: ");
                    baris = sc.nextInt();
                    System.out.print("Masukkan kolom: ");
                    kolom = sc.nextInt();
                    sc.nextLine();

                    if (baris < 1 || baris > penonton.length) {
                        System.out.println("Baris tidak tersedia. Pilih baris 1 sampai "
                                + penonton.length + ".");
                    } else if (kolom < 1 || kolom > penonton[baris - 1].length) {
                        System.out.println("Kolom tidak tersedia. Pilih kolom 1 sampai "
                                + penonton[baris - 1].length + ".");
                    } else if (penonton[baris - 1][kolom - 1] != null) {
                        System.out.println("Kursi baris " + baris + " kolom " + kolom
                                + " sudah terisi oleh " + penonton[baris - 1][kolom - 1]
                                + ". Pilih kursi lain.");
                    } else {
                        penonton[baris - 1][kolom - 1] = nama;
                        System.out.println("Data penonton berhasil disimpan.");
                        break;
                    }
                }
            } else if (menu == 2) {
                System.out.println("\nDaftar penonton:");
                for (int i = 0; i < penonton.length; i++) {
                    for (int j = 0; j < penonton[i].length; j++) {
                        if (penonton[i][j] == null) {
                            System.out.printf("%-10s", "***");
                        } else {
                            System.out.printf("%-10s", penonton[i][j]);
                        }
                    }
                    System.out.println();
                }
            } else if (menu != 3) {
                System.out.println("Menu tidak tersedia.");
            }
        } while (menu != 3);

        System.out.println("Terima kasih.");
    }
}