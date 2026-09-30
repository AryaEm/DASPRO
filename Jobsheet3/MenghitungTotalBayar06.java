import java.util.Scanner;

public class MenghitungTotalBayar06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double harga, potongan, jml_bayar, diskon = 0.15;

        System.out.print("Masukkan harga: ");
        harga = input.nextDouble();

        potongan = diskon * harga;
        jml_bayar = harga - potongan;

        System.out.println("Jumlah yang harus anda bayar adalah Rp. " + jml_bayar);
    }
}