import java.util.Scanner;
public class Day23 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Masukan ukuran panjang sisi  : " );
        double sisi = inp.nextDouble();

        System.out.println("Luas persegi : " + sisi * sisi);
    }
}

