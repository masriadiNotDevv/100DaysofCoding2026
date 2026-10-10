import java.util.Scanner;
public class Day39 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        System.out.print("Masukan angka pertama :");
        int angka1 = in.nextInt();
        System.out.print("Masukan angka kedua :");
        int angka2 = in.nextInt();

        System.out.print("masukan operator ( -, +, /, * ) : ");
        char operator = in.next().charAt(0);

        if (operator == '+') {
            System.out.println("Hasil tambah : " + (angka1 + angka2));
        } else if (operator == '-') {
            System.out.println("Hasil kurang : " + (angka1 - angka2));
        } else if (operator == '/') {
            System.out.println("Hasil bagi : " + (angka1 / angka2));
        } else if (operator == '*') {
            System.out.println("Hasil kali : " + (angka1 * angka2));
        } else {
            System.out.println("Operator tidak valid ")
        }
    }
}
