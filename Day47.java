import java.util.Scanner;

public class Day47{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("masukkan nomor hari (1-7):");
        int Numhari = in.nextInt();

        switch (Numhari) {
            case 1:
                System.out.println('Minggu");
                break;
            case 2:
                System.out.println("Senin");
                break;
            case 3:
                System.out.println("Selasa");
                break;
            case 4:
                System.out.println("Rabu");
                break;
            case 5:
                System.out.println("Kamis");
                break;
            case 6:
                System.out.println("Jumat");
                break;
            case 7:
                System.out.println("Sabtu");
                break;
            default:
                System.out.println"Nomor hari tidak diketahui (1-7) nmor");
        }
      
    }
}
