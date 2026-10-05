import java.util.Scanner;
public class Day34 {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        int nilai = inp.nextInt();

        if (nilai >= 95) {
            System.out.println("Sangat Bagus");
        } else if (nilai >= 85) {
            System.err.println("Bagus");
        } else if (nilai >= 75) {
            System.out.println("lumayan");
        } else if (nilai >= 65) {
            System.out.println("Baik");
        } else {
            System.out.println("anda mengulang");
        }
    }
}
