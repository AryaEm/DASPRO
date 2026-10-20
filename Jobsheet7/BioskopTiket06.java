package Jobsheet7;

import java.util.Scanner;

public class BioskopTiket06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int hargaTiket = 50000;
        int jumlahTiket, totalHarga, diskon, totalBayar;
        int totalTiketTerjual = 0;
        int totalPenjualan = 0;

        do {
            System.out.print("Masukkan jumlah tiket (0 untuk selesai): ");
            jumlahTiket = input.nextInt();

            if (jumlahTiket < 0) {
                System.out.println("Jumlah tiket tidak valid. Masukkan lagi!");
                continue;
            }
            if (jumlahTiket == 0) {
                break;
            }

            totalHarga = jumlahTiket * hargaTiket;
            diskon = 0;
            if (jumlahTiket > 10) {
                diskon = totalHarga * 15 / 100;
            } else if (jumlahTiket > 4) {
                diskon = totalHarga * 10 / 100;
            }
            totalBayar = totalHarga - diskon;

            System.out.println("Total harga : Rp " + totalHarga);
            System.out.println("Diskon      : Rp " + diskon);
            System.out.println("Total bayar : Rp " + totalBayar);

            totalTiketTerjual += jumlahTiket;
            totalPenjualan += totalBayar;
        } while (true);

        System.out.println("Total tiket terjual : " + totalTiketTerjual);
        System.out.println("Total penjualan     : Rp " + totalPenjualan);
    }

}
