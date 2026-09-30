import java.util.Scanner;

public class HitungCicilanLaptop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double x, y, z, sisa, bunga, totalBayar, cicilanPerBulan;

        System.out.print("Masukkan harga laptop: ");
        x = input.nextDouble();

        System.out.print("Masukkan uang muka: ");
        y = input.nextDouble();

        System.out.print("Masukkan lama cicilan (bulan): ");
        z = input.nextDouble();

        sisa = x - y;
        bunga = 0.02 * sisa;
        totalBayar = sisa + (bunga * z);
        cicilanPerBulan = totalBayar / z;

        System.out.println("Cicilan per bulan Rina adalah Rp. " + cicilanPerBulan);
    }
}