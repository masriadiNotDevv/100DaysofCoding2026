import java.util.Scanner;

public class Day44 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("masukan nilai mahasiswa : ");
        int nilai = in.nextInt();

        char predikat = 'N';

        if (nilai < 0 || nilai > 100) {
            System.out.println("Nilai tidak valid");
            return;
        } else if (nilai >=  90 && nilai <= 100) {
            predikat = 'A';
        } else if (nilai >= 80 && nilai <= 89 ) {
            predikat = 'B';
        } else if (nilai >= 70 && nilai <= 79) {
            predikat = 'C';
        } else if (nilai >= 60 && nilai <= 69) {
            predikat = 'D';

        } else {
            predikat = 'E';
            System.out.println("awokawok ngulang");
        } 
        System.out.println("Predikat : " + predikat);


    }
}
