import java.util.Scanner;

public class Day11 { 
    public static void main(String[] args) {
        
        // Inisialisasi Scanner untuk membaca input konsol
        Scanner input = new Scanner(System.in);

        System.out.println("=== DEMO INPUT TIPE DATA JAVA ===");

        // Input 8 tipe data primitif dan 1 tipe data referensi (String)
        System.out.print("Masukkan nilai Byte (-128 hingga 127): ");
        byte nilaiByte = input.nextByte();

        System.out.print("Masukkan nilai Short (-32768 hingga 32767): ");
        short nilaiShort = input.nextShort();

        System.out.print("Masukkan nilai Integer: ");
        int nilaiInt = input.nextInt();

        System.out.print("Masukkan nilai Long: ");
        long nilaiLong = input.nextLong();

        System.out.print("Masukkan nilai Float (contoh: 3,14): ");
        float nilaiFloat = input.nextFloat();

        System.out.print("Masukkan nilai Double (contoh: 3,14159): ");
        double nilaiDouble = input.nextDouble();

        System.out.print("Masukkan satu Karakter: ");
        char karakter = input.next().charAt(0);

        System.out.print("Masukkan status Boolean (true/false): ");
        boolean statusBoolean = input.nextBoolean();

        // Membersihkan buffer newline sebelum membaca teks/String
        input.nextLine(); 

        System.out.print("Masukkan Teks/Kalimat: ");
        String teksString = input.nextLine();

        // Menampilkan seluruh hasil input pengguna
        System.out.println("\n=== RINGKASAN DATA INPUT ===");
        System.out.println("Tipe Byte    : " + nilaiByte);
        System.out.println("Tipe Short   : " + nilaiShort);
        System.out.println("Tipe Integer : " + nilaiInt);
        System.out.println("Tipe Long    : " + nilaiLong);
        System.out.println("Tipe Float   : " + nilaiFloat);
        System.out.println("Tipe Double  : " + nilaiDouble);
        System.out.println("Tipe Char    : " + karakter);
        System.out.println("Tipe Boolean : " + statusBoolean);
        System.out.println("Tipe String  : " + teksString);

        // Menutup resource Scanner
        input.close(); 
    }
}
