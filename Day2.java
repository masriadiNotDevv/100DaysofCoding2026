/*
DAY 2 membuat biodata dengan println, printf dan print

*/

public class Day2 {
    public static void main(String[] args) {
         String nama = "masriadi";
        String kelas = "SISTEM INFORMASI B";
        double tinggi = 172.5;

        // 1. println -> otomatis ganti baris
        System.out.println("========== BIODATA SISWA ==========");
        System.out.println("Data berikut ini menggunakan 3 jenis print");

        // 2. print -> tetap di baris yg sama
        System.out.print("Nama   : ");
        System.out.println(nama); // digabung biar lanjut baris baru

        System.out.print("Kelas  : ");
        System.out.print(kelas);
        System.out.print(" | Jurusan: RPL"); // masih lanjut di baris yg sama
        
        System.out.println(); // ini buat enter manual

        // 3. printf -> buat format biar rapi
        System.out.printf("Tinggi : %.1f cm", tinggi); 
        System.out.printf("\nStatus : %s", "Aktif"); // \n = enter manual
        
        System.out.println("\n===================================");
    }
}