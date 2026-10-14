
import java.util.Scanner;

public class Day43 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int angka = in.nextInt();
        if (angka % 3 == 0 && angka % 5 == 0 ) {
            System.err.println("Kelipatan 3 dan 5 ");
        } else if (angka % 3 == 0) {
            System.err.println("kelipatan 3");
        } else {
            System.err.println("kelipatan 5");
        }
        
    }
}
