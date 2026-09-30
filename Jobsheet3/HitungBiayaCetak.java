import java.util.Scanner;

public class HitungBiayaCetak {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x;
        double biayaCetak, biayaJilid = 5000, totalBiaya;

        System.out.print("Masukkan jumlah lembar dokumen: ");
        x = input.nextInt();

        biayaCetak = x * 500;
        totalBiaya = biayaCetak + biayaJilid;

        System.out.println("Total biaya yang harus dibayar adalah Rp. " + totalBiaya);
    }
}