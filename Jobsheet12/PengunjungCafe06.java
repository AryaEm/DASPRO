package Jobsheet12;

public class PengunjungCafe06 {
    static int hitungTotalBelanja(int... harga) {
        int total = 0;
        for (int h : harga) {
            total += h;
        }
        return total;
    }

    public static void main(String[] args) {
        System.out.println("1 argumen : Rp" + hitungTotalBelanja(15000));
        System.out.println("3 argumen : Rp" + hitungTotalBelanja(15000, 20000, 22000));
        System.out.println("5 argumen : Rp" + hitungTotalBelanja(15000, 20000, 22000, 12000, 10000));
    }
}