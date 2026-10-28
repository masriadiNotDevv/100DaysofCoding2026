import  java.util.Scanner;
public class Day57 {
    public static  void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukan angka (n): ");
        int n = in.nextInt();
        for (int i = 1; i <=  n; i++) {
            System.out.println(i % 2 == 0?   i + " adalah angka genap" :   i + " adalah angka ganjil");
        }
    }
}
