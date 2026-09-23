import java.util.Scanner;
public class Day22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        int b;
        int nilaiSementara;

        System.out.print("Masukan nilai integer variabel a :");
        a = scanner.nextInt();

        System.out.print("Masukan nilai integer variabel b :");
        b = scanner.nextInt();

        System.out.println("Nilai variabel sebelum di tukar :");
        System.out.println("\tNilai variabel A : " + a);
        System.out.println("\tNilai variabel B : " + b);

        nilaiSementara = a;
        a = b;
        b = nilaiSementara;
        System.out.println("Nilai variabel setelah di tukar :");
        System.out.println("\tNilai variabel A : " + a);
        System.out.println("\tNilai variabel B : " + b);

    }
}
