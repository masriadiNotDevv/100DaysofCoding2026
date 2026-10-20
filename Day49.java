import java.util.Scanner;
public class Day49 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Udah imo ? (true / false): ");
        boolean isImo = in.nextBoolean();
        System.out.print(isImo ? "udah imo" : "belum imo");

    }
}
