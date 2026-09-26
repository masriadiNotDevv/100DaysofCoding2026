import java.util.Scanner;

public class Day25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Input bertipe String dari pengguna
        System.out.print("Masukkan jari-jari lingkaran (r): ");
        String inputString = scanner.nextLine();

        // 2. Konversi dari String ke tipe data bilangan bulat (Integer)
        int rInt = Integer.parseInt(inputString);

        // 3. Konversi dari bilangan bulat ke bilangan desimal (Double)
        double rDouble = (double) rInt;

        // 4. Hitung luas lingkaran (PI = 3.14)
        final double PI = 3.14;
        double luas = PI * rDouble * rDouble;

        // 5. Kurangi hasil akhir dengan (nilai hasil × 2)
        // Formula: luas - (luas * 2) = -luas
        double hasilAkhir = luas - (luas * 2);

        // 6. Konversi hasil akhir ke String
        String hasilString = String.valueOf(hasilAkhir);

        // 7. Tampilkan hasil String menggunakan printf
        System.out.printf("Hasil akhir (String): %s%n", hasilString);

        scanner.close();
    }
}
