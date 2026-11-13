import java.util.Scanner;

public class MenuBerulang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n=== MENU UTAMA ===");
            System.out.println("1. Tampilkan pesan ");
            System.out.println("2. Tampilkan pesan2");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu (1-3): ");
            
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("woi");
                    break;
                case 2:
                    System.out.println("dowhile");
                    break;
                case 3:
                    System.out.println("exit");
                    break;
                default:
                    System.out.println("Pilihan tidak valid, silakan coba lagi.");
            }
        } while (pilihan != 3);

        scanner.close();
    }
}
