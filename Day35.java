import java.util.Scanner;
public class Day35 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Punya KTM ? (true/false) : ");
        boolean punyaKTM = in.nextBoolean();

        System.out.print("Masukan umur : ");
        int umur = in.nextInt();

        if (umur >= 18) {
            if (punyaKTM) {
                System.out.println("Boleh masuk");
            } else {
                System.out.println("Tidak boleh masuk");
            }
        } else {
            System.out.println("Tidak boleh masuk");
        }
    }
}
