package Jobsheet6;

import java.util.Scanner;

public class StudiKasus206 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nama, jenis, status;
        int dokumen, peringkat, statusPKM, kurang;
        String berhak = "Berhak memperoleh dana penghargaan";
        String tidakDapat = "Tidak memperoleh dana penghargaan";
        String awalKurang = "Dokumen tidak lengkap (kurang ";
        String akhirKurang = " dokumen). "
                + "Dana penghargaan tidak diberikan.";

        System.out.print("Nama mahasiswa  : ");
        nama = input.nextLine().trim();
        System.out.print("Jenis kegiatan "
                + "(BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA) : ");
        jenis = input.nextLine().trim();

        if (jenis.equalsIgnoreCase("BELMAWA")
                || jenis.equalsIgnoreCase("BAKORMA")
                || jenis.equalsIgnoreCase("Mandiri")) {
            System.out.print("Jumlah dokumen  : ");
            dokumen = input.nextInt();
            System.out.print("Peringkat juara : ");
            peringkat = input.nextInt();

            if (peringkat >= 1 && peringkat <= 3) {
                if (dokumen == 4) {
                    status = berhak + " (Juara " + peringkat
                            + ", dokumen lengkap).";
                } else {
                    kurang = 4 - dokumen;
                    status = awalKurang + kurang + akhirKurang;
                }
            } else {
                status = tidakDapat
                        + " (hanya untuk Juara 1/2/3).";
            }
        } else if (jenis.equalsIgnoreCase("PKM")) {
            System.out.print("Jumlah dokumen  : ");
            dokumen = input.nextInt();
            System.out.print("Status pendanaan PKM "
                    + "(1 = lolos, 0 = tidak lolos) : ");
            statusPKM = input.nextInt();

            if (statusPKM == 1) {
                if (dokumen == 4) {
                    status = berhak
                            + " (PKM lolos pendanaan).";
                } else {
                    kurang = 4 - dokumen;
                    status = awalKurang + kurang + akhirKurang;
                }
            } else {
                status = tidakDapat
                        + " (PKM tidak lolos pendanaan).";
            }
        } else {
            status = tidakDapat + " (jenis kegiatan tidak "
                    + "termasuk ketentuan).";
        }

        System.out.println("Status : " + status);
    }
}
