package tugas;

import java.util.Scanner;

public class Modifikasi2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double lebar, panjang, diameter, sisi;

        System.out.print("Masukkan lebar tanah (m)    : ");
        lebar = sc.nextDouble();
        System.out.print("Masukkan panjang tanah (m)  : ");
        panjang = sc.nextDouble();
        System.out.print("Masukkan diameter kolam (m) : ");
        diameter = sc.nextDouble();
        System.out.print("Masukkan sisi taman (m)     : ");
        sisi = sc.nextDouble();

        double luasTanah = lebar * panjang;
        double jariJari = diameter / 2;
        double luasKolam = Math.PI * jariJari * jariJari;
        double luasTaman = sisi * sisi;
        double luasTidakDigunakan = luasTanah - luasKolam - luasTaman;

        System.out.println("Luas tanah yang tidak digunakan: " + luasTidakDigunakan + " m2");
    }
}