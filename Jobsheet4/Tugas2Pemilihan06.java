package Jobsheet4;

import java.util.Scanner;

public class Tugas2Pemilihan06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jumlahSks;

        System.out.print("Masukkan jumlah SKS: ");
        jumlahSks = input.nextInt();

        if (jumlahSks > 24) {
            System.out.println("Melebihi batas");
        } else {
            System.out.println("KRS valid");
        }

    }
}