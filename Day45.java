import java.util.Scanner;
public class Day45 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); {
            System.out.println("[ 1 ] menu satu");
            System.out.println("[ 2 ] menu dua");
            System.out.print("masukan pilihan : ");
            int pilihan = in.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("Kamu memilih pilihan 1 ");
                    break;
                    case 2:
                    System.out.println("Kamu memilih pilihan 2 ");
            
                default:
                    System.out.println("pilihan tidak valid");
                    break;
            }
            
        }
    }
}
