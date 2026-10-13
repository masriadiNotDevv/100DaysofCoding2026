import java.util.Scanner;

public class HitungGajiBersih {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Masukkan Gaji Pokok : ");
        double gajiPokok = in.nextDouble();
        
        if (gajiPokok <= 0) {
            System.out.println("Gaji tidak valid! Harus bernilai positif.");
            return;
        }
        
        System.out.print("Sudah menikah? (true/false) : ");
        boolean isNikah = in.nextBoolean();
        
        double tunjangan = isNikah ? (gajiPokok * 0.10) : 0.0;
        
        double gajiKotor = gajiPokok + tunjangan;
        
        double persentasePajak = 0.0;
        if (gajiKotor >= 5000000) {
            persentasePajak = 0.10; 
        } else {
            persentasePajak = 0.05; 
        }
        
        double nominalPajak = gajiKotor * persentasePajak;
        
        double gajiBersih = gajiKotor - nominalPajak;
        
        System.out.println("\n--- RINCIAN GAJI KARYAWAN ---");
        System.out.println("Gaji Pokok\t\t : Rp " + gajiPokok);
        System.out.println("Tunjangan\t\t : Rp " + tunjangan);
        System.out.println("Gaji Kotor\t\t : Rp " + gajiKotor);
        System.out.println("Potongan Pajak\t\t : Rp " + nominalPajak);
        System.out.println("------------------------------------");
        System.out.println("Gaji Bersih\t\t : Rp " + gajiBersih);
        
        in.close();
    }
}
