import java.util.Scanner;

public class Tugas2_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar",
                "Kentang Goreng", "Teh Tarik", "Cappucino",
                        "Chocolate Ice"};
        int[] harga = {15000, 13000, 10000, 12000, 8000, 18000, 20000};

        System.out.println("===== DAFTAR MENU KAFE KAMPUS =====");
        for (int i = 0; i < menu.length; i++) {
            System.out.printf("%d. %-16s Rp%6d%n", (i + 1), menu[i],
                    harga[i]);
        }

        System.out.print("\nCari menu: ");
        String cari = input.nextLine();
        int posisi = -1;
        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(cari)) {
                posisi = i;
                break;
            }
        }
        if (posisi != -1) {
            System.out.println("Menu tersedia: " + menu[posisi] + " - Rp"
                    + harga[posisi]);
        } else {
            System.out.println("Menu \"" + cari + "\" tidak tersedia.");
        }

        System.out.print("\nJumlah item yang dipesan: ");
        int jumlah = input.nextInt();
        input.nextLine();

        if (jumlah <= 0) {
            System.out.println("Jumlah item harus lebih dari 0.");
        } else {
            String[] pesanan = new String[jumlah];
            int[] hargaPesanan = new int[jumlah];
            int totalBiaya = 0;

            for (int p = 0; p < jumlah; p++) {
                int idx;
                do {
                    System.out.print("Pesanan ke-" + (p + 1) + ": ");
                    String nama = input.nextLine();

                    idx = -1;
                    for (int i = 0; i < menu.length; i++) {
                        if (menu[i].equalsIgnoreCase(nama)) {
                            idx = i;
                            break;
                        }
                    }
                    if (idx == -1) {
                        System.out.println("Menu \"" + nama
                                + "\" tidak tersedia, silakan ulangi.");
                    }
                } while (idx == -1);

                pesanan[p] = menu[idx];
                hargaPesanan[p] = harga[idx];
                totalBiaya += harga[idx];
            }

            System.out.println("\n========== DAFTAR PESANAN ==========");
            for (int p = 0; p < pesanan.length; p++) {
                System.out.printf("%d. %-16s Rp%6d%n", (p + 1), pesanan[p],
                        hargaPesanan[p]);
            }
            System.out.println("------------------------------------");
            System.out.printf("%-19s Rp%6d%n", "TOTAL BIAYA", totalBiaya);
        }
    }
}
