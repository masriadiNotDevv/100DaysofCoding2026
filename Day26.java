import java.util.Scanner;
public  class Day25 {
    public static void main(String[] args) {
     Scanner inp = new Scanner(System.in);

     System.out.print("[1] Masukan karakter : ");
     char karakter = inp.nextLine().ch  arAt(0);
     System.out.print("[2] Masukan karakter : ");
     char karakter2 = inp.nextLine().charAt(0);
     System.out.print("[3] Masukan karakter : ");
     char karakter3 = inp.nextLine().charAt(0);
System.out.println("\t=================");
System.out.print("\tINPUT\t|  OUTPUT\n");
System.out.println("\t  " + karakter + "\t     " + (int) karakter);
System.out.println("\t  " + karakter2 + "\t     " + (int) karakter2);
System.out.println("\t  " + karakter3 + "\t     " + (int) karakter3);
System.out.println("\t=================");

        inp.close();
    }
}
