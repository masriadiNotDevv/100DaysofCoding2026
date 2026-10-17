import java.util.Scanner;

public class day46 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== MENU UTAMA ===");
        System.out.println("1. Tampilkan Pesan");
        System.out.println("2. Hitung Luas Persegi");
        System.out.println("3. Keluar");
        System.out.print("Pilih menu (1-3): ");
        
        int pilihan = scanner.nextInt();

        switch (pilihan) {
            case 1:
                System.out.println("\nHalo, selamat belajar Java!");
                break;
            case 2:
                System.out.print("\nMasukkan panjang sisi persegi: ");
                double sisi = scanner.nextDouble();
                double luas = sisi * sisi;
                System.out.println("Luas Persegi = " + luas);
                break;
            case 3:
                System.out.println("\nProgram keluar. Terima kasih!");
                break;
            default:
                System.out.println("\nPilihan tidak valid!");
        }

        scanner.close();
    }
}
