import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
     while (true) {
         System.out.print("masukan umur : ");
         int umur = input.nextInt();
       
if (umur <= 0 || umur >= 80) {
    System.out.println("umur tidak valid , max umur 18-80");
    continue;
} else if (umur < 18) {
    System.out.println("lu masih bocil kontoll");
    continue;
} else if (umur >= 18) {
    System.out.println("ok anda cukup umur");
    break;
}


     }
    }
}