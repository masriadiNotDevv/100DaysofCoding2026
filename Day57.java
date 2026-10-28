import  java.util.Scanner;
public class Day57 {
    public static  void main(String[] args) {
        Scanner in = new Scanner(System.in); System.out.print("Masukan angka (n): ");
        int n = in.nextInt();
          System.out.print("angka genap : ");
        for (int i = 1; i <=  n; i++) {System.out.print(i % 2 == 0? i : " ");}
        System.out.print("\nangka ganjil : ");
        for (int i = 1; i <=  n; i++) { System.out.print(i % 2 != 0? i : " ");}
    }
}
