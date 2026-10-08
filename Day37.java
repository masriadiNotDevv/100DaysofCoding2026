import java.util.Scanner;
public class Day37 {
    public static void main(String[] args) {
        Scanner inp  = new Scanner(System.in);

        System.out.print("Masukan angka : ");
        int angka = inp.nextInt();

        if (angka >= 1) {
            System.out.println("Angka " + angka + ",Adalah bilangan positif");

        } else if (angka <= -1 ) {
            System.out.println("Angka " + angka + ", Adalah angka negatif ");
        } else{
            System.out.println("Angka nol "+ angka);
        }

    }
}
