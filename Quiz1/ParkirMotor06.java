package Quiz1;

import java.util.Scanner;

public class ParkirMotor06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=========================== PARKIR MOTOR KAMPUS ==========================");

        int lamaParkir, totalBiaya;
        int jamPertama = 2000;
        int jamBerikutnya = 1000;

        System.out.print("Masukkan lama parkir (jam): ");
        lamaParkir = input.nextInt();

        if (lamaParkir < 2) {
            System.out.print("Lama parkir minimal 2 jam: ");
            lamaParkir = input.nextInt();
        }

        totalBiaya = jamPertama + (lamaParkir - 1) * jamBerikutnya;

        System.out.println("Lama Parkir: " + lamaParkir + " jam");
        System.out.println("Total Biaya Parkir: Rp" + totalBiaya);
    }
}