package Jobsheet12;

import java.util.Scanner;

public class HitungBalok06 {
    static int hitungLuas(int pjg, int lb) {
        int Luas = pjg * lb;
        return Luas;
    }

    static int hitungVolume(int tinggi, int a, int b) {
        int volume = hitungLuas(a, b) * tinggi;
        return volume;
    }

    static int hitungLuasPermukaanBalok(int p, int l, int t) {
        return 2 * (hitungLuas(p, l) + hitungLuas(p, t) + hitungLuas(l, t));
    }

    public static void main(String[] args) {
        System.out.println("Balok 1 (4 x 3 x 5)");
        System.out.println("Luas permukaan: " + hitungLuasPermukaanBalok(4, 3, 5));
        System.out.println("Volume        : " + hitungVolume(5, 4, 3));

        System.out.println("Balok 2 (2 x 2 x 2)");
        System.out.println("Luas permukaan: " + hitungLuasPermukaanBalok(2, 2, 2));
        System.out.println("Volume        : " + hitungVolume(2, 2, 2));

        System.out.println("Balok 3 (10 x 5 x 3)");
        System.out.println("Luas permukaan: " + hitungLuasPermukaanBalok(10, 5, 3));
        System.out.println("Volume        : " + hitungVolume(3, 10, 5));
    }
}