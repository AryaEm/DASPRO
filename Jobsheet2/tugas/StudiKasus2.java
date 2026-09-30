package tugas;

public class StudiKasus2 {
    public static void main(String[] args) {
        double lebar = 30;
        double panjang = 100;
        double diameter = 5;
        double sisi = 2;

        double luasTanah = lebar * panjang;
        double jariJari = diameter / 2;
        double luasKolam = Math.PI * jariJari * jariJari;
        double luasTaman = sisi * sisi;

        double luasTidakDigunakan = luasTanah - luasKolam - luasTaman;

        System.out.println("Luas tanah                  : " + luasTanah + " m2");
        System.out.println("Luas kolam                  : " + luasKolam + " m2");
        System.out.println("Luas taman bunga            : " + luasTaman + " m2");
        System.out.println("Luas tanah tidak digunakan  : " + luasTidakDigunakan + " m2");
    }
}