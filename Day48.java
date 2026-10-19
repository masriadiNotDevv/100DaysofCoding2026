import java.util.Scanner;
public class Day48 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukan angka pertama : ");
        int angka1 = in.nextInt();
        System.out.print("Masukan angka kedua : ");
        int angka2 = in.nextInt();
        
        System.out.print("masukan operator (-, + , /,  *)");
        char operator = in.next().charAt(0);

        switch (operator) {
            case '-':
                System.out.println("hasil kurang : " + (angka1 - angka2));
                break;
            
            case '+':
                System.out.println("hasil tambah : " + (angka1 + angka2));
                break;
            
            case '/':
                System.out.println("hasil bagi : " + (angka1 / angka2));
                break;
            
            case '*':
                System.out.println("hasil kurang : "  + (angka1 *  angka2));
                break;

            default: 
             System.out.println("operator tidak valid");
             break;
        }

    }
}
