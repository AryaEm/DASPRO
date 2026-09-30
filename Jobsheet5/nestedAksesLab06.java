package Jobsheet5;

import java.util.Scanner;

public class nestedAksesLab06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean mahasiswaAktif;
        boolean sedangDisanksi;
        boolean punyaIzinDosen;
        boolean asistenLab;

        System.out.print("Apakah mahasiswa berstatus aktif? (true/false): ");
        mahasiswaAktif = input.nextBoolean();

        System.out.print("Apakah mahasiswa sedang disanksi? (true/false): ");
        sedangDisanksi = input.nextBoolean();

        System.out.print("Apakah mahasiswa punya izin dosen? (true/false): ");
        punyaIzinDosen = input.nextBoolean();

        System.out.print("Apakah mahasiswa asisten lab? (true/false): ");
        asistenLab = input.nextBoolean();

        if (mahasiswaAktif && !sedangDisanksi) {
            if (punyaIzinDosen || asistenLab) {
                System.out.println("Akses laboratorium diberikan");
            } else {
                System.out.println("Akses ditolak: membutuhkan izin dosen atau status asisten lab");
            }
        } else {
            System.out.println("Akses ditolak: status mahasiswa tidak memenuhi syarat");
        }
    }
}
