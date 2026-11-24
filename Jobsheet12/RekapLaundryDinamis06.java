package Jobsheet12;

import java.util.Scanner;

public class RekapLaundryDinamis06 {
    static Scanner sc = new Scanner(System.in);

    static int[][] inputData(String[] layanan, int jumlahHari) {
        int[][] data = new int[layanan.length][jumlahHari];
        for (int i = 0; i < layanan.length; i++) {
            for (int j = 0; j < jumlahHari; j++) {
                System.out.print(layanan[i] + " - Hari ke-" + (j + 1) + " (kg): ");
                data[i][j] = Integer.parseInt(sc.nextLine());
            }
        }
        return data;
    }

    static void tampilData(int[][] data, String[] layanan, int[] harga) {
        System.out.println("\n=== Rekap Berat Cucian (kg) ===");
        System.out.printf("%-14s%-10s", "Layanan", "Harga/kg");
        for (int j = 0; j < data[0].length; j++) {
            System.out.printf("%-8s", "Hari-" + (j + 1));
        }
        System.out.println();
        for (int i = 0; i < data.length; i++) {
            System.out.printf("%-14s%-10d", layanan[i], harga[i]);
            for (int j = 0; j < data[i].length; j++) {
                System.out.printf("%-8d", data[i][j]);
            }
            System.out.println();
        }
    }

    static int totalPerLayanan(int[][] data, int idxLayanan) {
        int total = 0;
        for (int j = 0; j < data[idxLayanan].length; j++) {
            total += data[idxLayanan][j];
        }
        return total;
    }

    static void tampilLayananTertinggi(int[][] data, String[] layanan) {
        int idxMax = 0;
        for (int i = 1; i < data.length; i++) {
            if (totalPerLayanan(data, i) > totalPerLayanan(data, idxMax)) {
                idxMax = i;
            }
        }
        System.out.println("\nLayanan dengan cucian tertinggi: " + layanan[idxMax]
                + " (" + totalPerLayanan(data, idxMax) + " kg)");
    }

    static int hariTersibuk(int[][] data) {
        int idxMax = 0;
        int totalMax = 0;
        for (int j = 0; j < data[0].length; j++) {
            int totalHari = 0;
            for (int i = 0; i < data.length; i++) {
                totalHari += data[i][j];
            }
            if (totalHari > totalMax) {
                totalMax = totalHari;
                idxMax = j;
            }
        }
        return idxMax;
    }

    static void tampilPendapatan(int[][] data, String[] layanan, int[] harga) {
        System.out.println("\n=== Pendapatan per Layanan ===");
        int totalPendapatan = 0;
        for (int i = 0; i < data.length; i++) {
            int pendapatan = totalPerLayanan(data, i) * harga[i];
            totalPendapatan += pendapatan;
            System.out.printf("%-14s: Rp%d\n", layanan[i], pendapatan);
        }
        System.out.println("Total pendapatan : Rp" + totalPendapatan);
    }

    public static void main(String[] args) {
        System.out.print("Jumlah layanan: ");
        int jumlahLayanan = Integer.parseInt(sc.nextLine());
        System.out.print("Jumlah hari: ");
        int jumlahHari = Integer.parseInt(sc.nextLine());

        String[] layanan = new String[jumlahLayanan];
        int[] harga = new int[jumlahLayanan];
        for (int i = 0; i < jumlahLayanan; i++) {
            System.out.print("Nama layanan ke-" + (i + 1) + ": ");
            layanan[i] = sc.nextLine();
            System.out.print("Harga per kg " + layanan[i] + ": ");
            harga[i] = Integer.parseInt(sc.nextLine());
        }

        int[][] data = inputData(layanan, jumlahHari);
        tampilData(data, layanan, harga);

        System.out.println("\n=== Total Berat per Layanan ===");
        for (int i = 0; i < data.length; i++) {
            System.out.println(layanan[i] + " : " + totalPerLayanan(data, i) + " kg");
        }

        tampilLayananTertinggi(data, layanan);

        int idxHari = hariTersibuk(data);
        System.out.println("Hari tersibuk: Hari ke-" + (idxHari + 1));

        tampilPendapatan(data, layanan, harga);
        sc.close();
    }
}
