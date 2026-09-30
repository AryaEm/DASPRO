import java.util.Scanner;

public class MenghitungLuasPersegiPanjang06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int lebar, panjang, luas;

        System.out.print("Masukkan panjang: ");
        panjang = input.nextInt();
        System.out.print("Masukkan lebar: ");
        lebar = input.nextInt();

        luas = lebar * lebar;

        System.out.println("Luas persegi panjang adalah: " + luas);

    }
}
