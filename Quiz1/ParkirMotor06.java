package Quiz1;

import java.util.Scanner;

public class ParkirMotor06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println();
        System.out.println("=== PARKIR MOTOR KAMPUS ===");
        System.out.println();

        System.out.print("Masukkan lama parkir (jam) : ");
        int lamaParkir = input.nextInt();

        if (lamaParkir < 2) {
            System.out.println("Input tidak valid. Lama parkir minimal 2 jam.");
            System.out.println();
        } else {
            final int TARIF_JAM_PERTAMA = 2000;
            final int TARIF_JAM_BERIKUTNYA = 1000;

            int tarifJamPertama = TARIF_JAM_PERTAMA;
            int jamBerikutnya = lamaParkir - 1;
            int tarifJamBerikutnya = jamBerikutnya * TARIF_JAM_BERIKUTNYA;
            int totalBiaya = tarifJamPertama + tarifJamBerikutnya;

            System.out.printf("Total Biaya Parkir    : Rp %,d\n", totalBiaya);
            System.out.println();
        }
    }
}