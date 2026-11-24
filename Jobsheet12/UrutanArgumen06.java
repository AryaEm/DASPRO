package Jobsheet12;

public class UrutanArgumen06 {
    static int hitungLuas(int pjg, int lb) {
        return pjg * lb;
    }

    static int hitungVolume(int tinggi, int a, int b) {
        return hitungLuas(a, b) * tinggi;
    }

    static int kurang(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {
        int p = 4, l = 3, t = 5;
        System.out.println("hitungVolume(t, p, l) = " + hitungVolume(t, p, l));
        System.out.println("hitungVolume(p, l, t) = " + hitungVolume(p, l, t));
        System.out.println("kurang(10, 3) = " + kurang(10, 3));
        System.out.println("kurang(3, 10) = " + kurang(3, 10));
    }
}