package Jobsheet12;

public class HitungBalokTanpaFungsi06 {
    public static void main(String[] args) {
        int p, l, t;

        p = 4; l = 3; t = 5;
        System.out.println("Balok 1 (4 x 3 x 5)");
        System.out.println("Luas permukaan: " + 2 * (p * l + p * t + l * t));
        System.out.println("Volume        : " + p * l * t);

        p = 2; l = 2; t = 2;
        System.out.println("Balok 2 (2 x 2 x 2)");
        System.out.println("Luas permukaan: " + 2 * (p * l + p * t + l * t));
        System.out.println("Volume        : " + p * l * t);

        p = 10; l = 5; t = 3;
        System.out.println("Balok 3 (10 x 5 x 3)");
        System.out.println("Luas permukaan: " + 2 * (p * l + p * t + l * t));
        System.out.println("Volume        : " + p * l * t);
    }
}
