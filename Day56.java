import java.util.Scanner;

public class Day56 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nilai N: ");
        int n = scanner.nextInt();

        System.out.println("\n--- Hasil Cetak ---");
        System.out.print("Angka 1 sampai " + n + ": ");
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        System.out.println(); // Pindah baris

        System.out.print("Angka " + n + " turun ke 1: ");
        for (int i = n; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        scanner.close();
    }
}
