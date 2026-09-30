package tugas;

import java.util.Scanner;

public class Modifikasi1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int gajiPokok, tunjanganPerAnak, jumlahAnak;

        System.out.print("Masukkan gaji pokok        : ");
        gajiPokok = sc.nextInt();
        System.out.print("Masukkan tunjangan per anak: ");
        tunjanganPerAnak = sc.nextInt();
        System.out.print("Masukkan jumlah anak       : ");
        jumlahAnak = sc.nextInt();

        double potonganPensiun = 0.10 * gajiPokok;
        double totalTunjangan = tunjanganPerAnak * jumlahAnak;
        double gajiBersih = gajiPokok + totalTunjangan - potonganPensiun;

        System.out.println("Gaji bersih Anda adalah: " + gajiBersih);
    }
}