import java.util.Scanner;
public class Day38 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Pilih menu : ");
        System.out.println("  1. Cek umur : ");
        System.out.println("  2. Cek saldo : ");
        System.out.print("Pilih menu ( 1, 2 ) : ");
        char pilihan = inp.next().charAt(0);
        int saldo = 1000000;
        if (pilihan == '1') {
            System.out.print("Tahun lahir kamu : ");
            int tahunLahir = inp.nextInt();
            System.out.println("Umur kamu adalah " + (2026 - tahunLahir));
        }
         else if (pilihan == '2') {
            System.out.println("sisa saldo kamu adlah : " + saldo );
         } else {
            System.out.println("Pilihan tidak valid ");
         }

    }    
}
