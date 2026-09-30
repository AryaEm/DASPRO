package Jobsheet4;

import java.util.Scanner;

public class TugasAntrean06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int kodeLayanan;

        System.out.print("Masukkan kode layanan (1-4): ");
        kodeLayanan = input.nextInt();

        switch (kodeLayanan) {
            case 1:
                System.out.println("Layanan: Pendaftaran KRS");
                break;
            case 2:
                System.out.println("Layanan: Legalisir Ijazah");
                break;
            case 3:
                System.out.println("Layanan: Surat Keterangan Aktif Kuliah");
                break;
            case 4:
                System.out.println("Layanan: Konsultasi Dosen PA");
                break;
            default:
                System.out.println("Kode layanan tidak tersedia");
        }
    }
}
