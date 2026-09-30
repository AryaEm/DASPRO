package Jobsheet5;

import java.util.Scanner;

public class tugas1DiskonBuku06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int diskon = 0;

        System.out.println("=== Diskon Toko Buku ===");
        System.out.print("Masukkan hari: ");
        String hari = input.nextLine().trim();

        System.out.print("Masukkan jenis buku (kamus/novel/lainnya): ");
        String jenis = input.nextLine().trim();

        System.out.print("Masukkan jumlah buku: ");
        int jumlah = input.nextInt();

        if (hari.equalsIgnoreCase("Rabu")) {
            if (jenis.equalsIgnoreCase("kamus")) {
                diskon = 10;
                if (jumlah > 2) {
                    diskon += 2;
                }
            } else if (jenis.equalsIgnoreCase("novel")) {
                diskon = 7;
                if (jumlah > 3) {
                    diskon += 2;
                } else {
                    diskon += 1;
                }
            } else {
                if (jumlah > 3) {
                    diskon = 5;
                }
            }
            System.out.println("Jumlah diskon: " + diskon + "%");
        } else {
            System.out.println("Tidak ada diskon. Diskon hanya berlaku pada hari Rabu");
        }
    }
}