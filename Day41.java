import java.util.Scanner;
public class Day41 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukan suhu ruangan (c) : ");
        int suhu = in.nextInt();

        if (suhu < 18) {
            System.out.println("Suhu ruangan dingin, dengan suhu " + suhu + "c");
        } else if(suhu <= 27) {
            System.out.println("Suhu ruangan normal, dengan suhu  " + suhu + "c");
        } else {
            System.out.println("suhu ruangan panas, dengan suhu " + suhu + "c");
        }
        
    }
}
