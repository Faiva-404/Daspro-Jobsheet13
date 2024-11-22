import java.util.Scanner;
public class ModifPercob2 {
    public static void Menu(String namaMakanan, boolean tersedia) {
            System.out.println("Nama Makanan: " + namaMakanan);
            System.out.println("Tersedia: " + (tersedia ? "Ya" : "Tidak"));
    }
    
        // Fungsi Menu dengan tambahan parameter kodePromo
        public static void Menu(String namaMakanan, boolean tersedia, String kodePromo) {
            System.out.println("Nama Makanan: " + namaMakanan);
            System.out.println("Tersedia: " + (tersedia ? "Ya" : "Tidak"));
    
            switch (kodePromo) {
                case "DISKON50":
                    System.out.println("Anda mendapatkan diskon 50%!");
                    break;
                case "DISKON30":
                    System.out.println("Anda mendapatkan diskon 30%!");
                    break;
                default:
                    System.out.println("Kode promo tidak valid.");
                    break;
            }
        }
    
    public static void main(String[] args) {
            // Contoh penggunaan fungsi Menu dengan kodePromo
            Menu("Kopi Hitam", true, "DISKON50");
            Menu("Cappucino", false, "DISKON30");
            Menu("Latte", true, "DISKON30");
            Menu("Teh Tarik", false, "DISKON50");
            Menu("Roti Bakar", false, "DISKON30");
            Menu("Mie Goreng", true, "DISKON50");
            Menu("Ayam Katsu", true, "INVALIDCODE");
    }    
}