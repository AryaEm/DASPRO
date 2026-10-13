package Quis2;

import java.util.Scanner;

public class JenisSegitiga {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println();
        System.out.print("Masukkan besaran sudut 1: ");
        int besaranSudut1 = input.nextInt();
        System.out.print("Masukkan besaran sudut 2: ");
        int besaranSudut2 = input.nextInt();
        System.out.print("Masukkan besaran sudut 3: ");
        int besaranSudut3 = input.nextInt();

        if (besaranSudut1 == 90 && besaranSudut2 == 45 && besaranSudut3 == 45) {
            System.out.println("Segitiga Siku-siku");
            System.out.println();
        } else if (besaranSudut1 == 180 && besaranSudut2 == 45 && besaranSudut3 == 45) {
            System.out.println("Segitiga Sama Kaki");
            System.out.println();
        } else if (besaranSudut1 == 45 && besaranSudut2 == 45 && besaranSudut3 == 45) {
            System.out.println("Segitiga Sama Sisi");
            System.out.println();
        } else
            System.out.println("Bukan Segitiga");
        System.out.println();   
    }
}