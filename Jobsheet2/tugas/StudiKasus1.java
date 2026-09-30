package tugas;

public class StudiKasus1 {
    public static void main(String[] args) {

        int gajiPokok = 5000000;
        int tunjanganPerAnak = 100000;
        int jumlahAnak = 4;

        double potonganPensiun = 0.10 * gajiPokok;
        double totalTunjangan = tunjanganPerAnak * jumlahAnak;
        double gajiBersih = gajiPokok + totalTunjangan - potonganPensiun;

        System.out.println("Gaji pokok         : " + gajiPokok);
        System.out.println("Tunjangan anak     : " + totalTunjangan);
        System.out.println("Potongan pensiun   : " + potonganPensiun);
        System.out.println("Gaji bersih        : " + gajiBersih);
    }
}