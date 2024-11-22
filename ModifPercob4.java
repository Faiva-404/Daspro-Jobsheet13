import java.util.Scanner;
public class ModifPercob4 {
    public static void cetakPesanan(String namaPengunjung, String...pesanan) {
        System.out.println("Nama Pengunjung : " + namaPengunjung);
        System.out.println("Daftar Pesanan");

        for(String item : pesanan) {
            System.out.println("- " + item);
        }
    }

    public static void main(String[] args) {
        cetakPesanan("Ali", "Kopi", "Bakso", "Bakwan");
    }
}
