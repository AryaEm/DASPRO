package Jobsheet4;

import java.util.Scanner;

public class TugasParkir06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int kodeKendaraan, lamaParkir;
        int tarifPerJam, biaya;

        System.out.print("Masukkan kode kendaraan (1 = Motor, 2 = Mobil): ");
        kodeKendaraan = input.nextInt();
        System.out.print("Masukkan lama parkir (jam): ");
        lamaParkir = input.nextInt();

        if (kodeKendaraan == 1) {
            tarifPerJam = 2000;
            biaya = tarifPerJam * lamaParkir;
            System.out.println("Biaya parkir motor Anda adalah Rp. " + biaya);
        } else if (kodeKendaraan == 2) {
            tarifPerJam = 5000;
            biaya = tarifPerJam * lamaParkir;
            System.out.println("Biaya parkir mobil Anda adalah Rp. " + biaya);
        } else {
            System.out.println("Kendaraan tidak dikenali");
        }

    }
}