import java.util.Scanner;
public class Percobaan5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int p,l,t,L,vol;

        System.out.println("Masukkan Panjang");
        p = input.nextInt();
        System.out.println("Masukkan lebar");
        l = input.nextInt();
        System.out.println("Masukkan tinggi");
        t = input.nextInt();

        L = p*l;
        System.out.println("Luas Persegi panjang adalah" + L);

        vol = p*l*t;
        System.out.println("Volume balok adalah" + vol);
    }

    //Fungsi Hitung Luas
    public static int hitungLuas (int pjg, int lb) {
        int Luas = pjg*lb;
        return Luas;
    }

    //Fungsi Hitung Volume
    public static hitungVolume (int tinggi, int a, int b) {
        int volume = hitungLuas(a,b) * tinggi;
        return volume;
    }

    //Fungsi Main
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int p,l,t,L, vol;
        System.out.println("Masukkan panjang : ");
        p = input.nextInt();
        System.out.println("Masukkan lebar : ");
        l = input.nextInt();
        System.out.println("Masukkan tinggi : ");
        t = input.nextInt();

        L = hitungLuas(p, l);
        System.out.println("Luas Persegi Panjang adalah : " + L);
        vol = hitungVolume (p, l, t);
        System.out.println("Volume Balok adalah : " + vol);
    }
}
