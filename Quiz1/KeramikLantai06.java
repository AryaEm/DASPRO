package Quiz1;

import java.util.Scanner;

public class KeramikLantai06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== HITUNG KEBUTUHAN KERAMIK ===");
        System.out.println();

        System.out.print("Masukkan panjang ruangan (meter) : ");
        double panjangRuanganM = input.nextDouble();

        System.out.print("Masukkan lebar ruangan (meter)   : ");
        double lebarRuanganM = input.nextDouble();

        final double SISI_KERAMIK_M = 0.6;
        final int HARGA_PER_KERAMIK = 45000;
        final double PERSEN_CADANGAN = 0.10;

        double luasRuangan = panjangRuanganM * lebarRuanganM;
        double luasKeramik = SISI_KERAMIK_M * SISI_KERAMIK_M;

        double keramikMinimumExact = luasRuangan / luasKeramik;
        int keramikMinimum = (int) Math.ceil(keramikMinimumExact);

        int keramikCadangan = (int) Math.ceil(keramikMinimum * PERSEN_CADANGAN);

        int totalKeramik = keramikMinimum + keramikCadangan;

        long totalBiaya = (long) totalKeramik * HARGA_PER_KERAMIK;

        System.out.println();
        System.out.println("=== TAHPAN PROSES PENGHITUNGAN ===");
        System.out.printf("Luas Ruangan              : %.2f m2\n", luasRuangan);
        System.out.printf("Luas 1 Keramik (60x60 cm) : %.2f m2\n", luasKeramik);
        System.out.println("Jumlah Keramik Minimum    : " + keramikMinimum + " buah");
        System.out.println("Tambahan Cadangan (10%)   : " + keramikCadangan + " buah");
        System.out.println("Total Keramik Dibeli      : " + totalKeramik + " buah");
        System.out.println("--------------------------------");
        System.out.printf("Total Biaya Belanja       : Rp %d\n", totalBiaya);
        System.out.println();
    }
}
