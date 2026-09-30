package Jobsheet5;

import java.util.Scanner;

public class tugas2SeleksiAsisten06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Seleksi Calon Asisten Praktikum ===");
        System.out.print("Apakah mahasiswa berstatus aktif? (true/false): ");
        boolean aktif = input.nextBoolean();

        System.out.print("Apakah mahasiswa sedang mendapat sanksi akademik? (true/false): ");
        boolean sedangSanksi = input.nextBoolean();

        System.out.print("Masukkan nilai Dasar Pemrograman: ");
        int nilaiDasPro = input.nextInt();

        System.out.print("Apakah mahasiswa punya sertifikat kompetensi pemrograman? (true/false): ");
        boolean punyaSertifikat = input.nextBoolean();

        if (aktif && !sedangSanksi) {
            if (nilaiDasPro >= 80 || punyaSertifikat) {
                System.out.println("Lolos seleksi berkas. Mahasiswa dipanggil untuk wawancara");
                System.out.print("Masukkan nilai wawancara: ");
                int nilaiWawancara = input.nextInt();

                if (nilaiWawancara >= 75) {
                    System.out.println("Selamat! Mahasiswa diterima sebagai asisten praktikum");
                } else {
                    System.out.println("Gagal! Nilai wawancara kurang dari 75");
                }
            } else {
                System.out.println("Gagal! Nilai Dasar Pemrograman kurang dari 80 dan tidak memiliki sertifikat kompetensi");
            }
        } else {
            System.out.println("Gagal! Mahasiswa tidak berstatus aktif atau sedang mendapat sanksi akademik");
        }
    }
}