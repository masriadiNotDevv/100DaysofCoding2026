import java.util.Scanner;

public class Day78 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String regUser = "admin";
        String regPass = "12345";
        System.out.println("=== SILAKAN LOGIN ===");
        while (true) {
            System.out.print("Masukkan Username: ");
            String inputUser = scanner.nextLine();

            System.out.print("Masukkan Password: ");
            String inputPass = scanner.nextLine();

            if (inputUser.equals(regUser) && inputPass.equals(regPass)) {
                System.out.println("Login Berhasil! Selamat datang, " + regUser + ".");
                break; // Menghentikan loop ketika login benar
            } else {
                System.out.println("Username atau Password salah! Silakan coba lagi.\n");
            }
        }

        scanner.close();
    }
}
