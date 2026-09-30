public class ContohVariabel06 {
    public static void main(String[] args) {
        String salahSatuHobiSaya = "Bermain Free Fire";
        Boolean isPintar = true;
        char jk = 'L';
        byte umurSaya = 18;
        double IPK = 3.21, tinggi = 1.73;

        System.out.println(salahSatuHobiSaya);
        System.out.println("Apakah pintar? " + isPintar);
        System.out.println("Jenis kelasim: " + jk);
        System.out.println("Umurku saat ini: " + umurSaya);
        System.out.println(String.format("Saya beripk %s, dengan tinggi badan %s m", IPK, tinggi));
    }
}