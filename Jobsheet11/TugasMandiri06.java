package Jobsheet11;

import java.util.Scanner;
 
public class TugasMandiri06 {
    public static void main(String[] args) {
        final int JUMLAH_RESPONDEN = 10;
        final int JUMLAH_PERTANYAAN = 6;
 
        Scanner input = new Scanner(System.in);
        int[][] survei = new int[JUMLAH_RESPONDEN][JUMLAH_PERTANYAAN];
 
        // Input jawaban survei (1 sampai 5)
        for (int i = 0; i < JUMLAH_RESPONDEN; i++) {
            System.out.println("Responden ke-" + (i + 1));
 
            for (int j = 0; j < JUMLAH_PERTANYAAN; j++) {
                int jawaban;
                do {
                    System.out.print("Jawaban pertanyaan " + (j + 1) + " (1-5): ");
                    jawaban = input.nextInt();
                    if (jawaban < 1 || jawaban > 5) {
                        System.out.println("Jawaban harus bernilai 1 sampai 5.");
                    }
                } while (jawaban < 1 || jawaban > 5);
                survei[i][j] = jawaban;
            }
        }
 
        // Rata-rata setiap responden (per baris)
        int totalSemua = 0;
        System.out.println("\n===== RATA-RATA SETIAP RESPONDEN =====");
        for (int i = 0; i < JUMLAH_RESPONDEN; i++) {
            int totalResponden = 0;
            for (int j = 0; j < JUMLAH_PERTANYAAN; j++) {
                totalResponden += survei[i][j];
            }
            totalSemua += totalResponden;
            System.out.printf("Responden ke-%d : %.2f%n", (i + 1),
                    (double) totalResponden / JUMLAH_PERTANYAAN);
        }
 
        // Rata-rata setiap pertanyaan (per kolom)
        System.out.println("\n===== RATA-RATA SETIAP PERTANYAAN =====");
        for (int j = 0; j < JUMLAH_PERTANYAAN; j++) {
            int totalPertanyaan = 0;
            for (int i = 0; i < JUMLAH_RESPONDEN; i++) {
                totalPertanyaan += survei[i][j];
            }
            System.out.printf("Pertanyaan ke-%d : %.2f%n", (j + 1),
                    (double) totalPertanyaan / JUMLAH_RESPONDEN);
        }
 
        // Rata-rata keseluruhan
        System.out.println("\n===== RATA-RATA KESELURUHAN =====");
        System.out.printf("Rata-rata keseluruhan : %.2f%n",
                (double) totalSemua / (JUMLAH_RESPONDEN * JUMLAH_PERTANYAAN));
    }
}