import java.util.Scanner;
public class ModifPercob3 {
    public static int hitungTotalHarga(int pilihanMenu, int banyakItem) {
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};
        int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;
        return hargaTotal;
    }

    // Fungsi utama
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalKeseluruhan = 0; // Variabel untuk menyimpan total keseluruhan pesanan

        System.out.println("Daftar Menu:");
        System.out.println("1. Menu A - Rp 15,000");
        System.out.println("2. Menu B - Rp 20,000");
        System.out.println("3. Menu C - Rp 22,000");
        System.out.println("4. Menu D - Rp 12,000");
        System.out.println("5. Menu E - Rp 10,000");
        System.out.println("6. Menu F - Rp 18,000");

        while (true) {
            // Meminta input pilihan menu dari pengguna
            System.out.print("\nMasukkan nomor menu yang ingin Anda pesan (0 untuk selesai): ");
            int pilihanMenu = sc.nextInt();

            // Jika pengguna memasukkan 0, keluar dari loop
            if (pilihanMenu == 0) {
                break;
            }

            // Validasi nomor menu
            if (pilihanMenu < 1 || pilihanMenu > 6) {
                System.out.println("Nomor menu tidak valid, silakan coba lagi.");
                continue;
            }

            // Meminta input jumlah item dari pengguna
            System.out.print("Masukkan jumlah item yang ingin dipesan: ");
            int banyakItem = sc.nextInt();

            // Menghitung total harga untuk menu yang dipilih
            int totalHarga = hitungTotalHarga(pilihanMenu, banyakItem);
            totalKeseluruhan += totalHarga;

            // Menampilkan total harga untuk menu yang dipilih
            System.out.println("Total harga untuk pesanan ini: Rp " + totalHarga);
        }

        // Menampilkan total keseluruhan pesanan
        System.out.println("\nTotal keseluruhan pesanan Anda: Rp " + totalKeseluruhan);
    }
}