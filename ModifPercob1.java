import java.util.Scanner;
public class ModifPercob1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalPrice = 0;
        System.out.println("===== MENU RESTO KAFE =====");
        System.out.println("1. Kopi Hitam - Rp 15,000");
        System.out.println("2. Cappuccino - Rp 20,000");
        System.out.println("3. Latte - Rp 22,000");
        System.out.println("4. Teh Tarik - Rp 12,000");
        System.out.println("5. Roti Bakar - Rp 10,000");
        System.out.println("6. Mie Goreng - Rp 18,000");
        System.out.println("============================");
        System.out.println("Silakan pilih menu yang anda inginkan.");
        System.out.print("Masukkan pilihan Anda (1-6): ");
 
        int choice = scanner.nextInt();
 
        switch (choice) {
            case 1:
            totalPrice = 15000;
            System.out.println("Anda memilih Kopi Hitam. Total harga: Rp 15,000");
 
            break;
            case 2:
            totalPrice = 20000;
            System.out.println("Anda memilih Cappuccino. Total harga: Rp 20,000");
 
            break;
            case 3:
            totalPrice = 22000;
            System.out.println("Anda memilih Latte. Total harga: Rp 22,000");
 
            break;
            case 4:
            totalPrice = 12000;
            System.out.println("Anda memilih Teh Tarik. Total harga: Rp 12,000");
 
            break;
            case 5:
            totalPrice = 10000;
            System.out.println("Anda memilih Roti Bakar. Total harga: Rp 10,000");
 
            break;
            case 6:
            totalPrice = 18000;
            System.out.println("Anda memilih Mie Goreng. Total harga: Rp 18,000");
 
            break;
            default:
            System.out.println("Pilihan tidak valid.");
 
            break;
        }
 
        if (totalPrice > 0) {
            System.out.println("Total yang harus dibayar: Rp " + totalPrice);
        }
    }
}
