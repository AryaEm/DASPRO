import java.util.Scanner;

public class JenisSegitiga {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String Segitiga;

        System.out.println();
        System.out.print("Masukkan Besaran Sudut 1: ");
        int besaranSudut1 = input.nextInt();
        System.out.print("Masukkan Besaran Sudut 2: ");
        int besaranSudut2 = input.nextInt();
        System.out.print("Masukkan Besaran Sudut 3: ");
        int besaranSudut3 = input.nextInt();

        if (besaranSudut1 == 90 && besaranSudut2 == 45 && besaranSudut3 == 45) {
            Segitiga = "Siku-siku";
        } else if (besaranSudut1 == 180 && besaranSudut2 == 45 && besaranSudut3 == 45) {
            Segitiga = "Sama Kaki";
        } else if (besaranSudut1 == 45 && besaranSudut2 == 45 && besaranSudut3 == 45) {
            Segitiga = "Sama Sisi";
        } else {
            Segitiga = "Bukan Segitiga";
        }
        System.out.println("Segitiga " + Segitiga);
        System.out.println();
    }
}
