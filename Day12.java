import java.util.Scanner;
public class Day12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
      //  membuat program biodata sederhana 
      
     System.out.print("Masukan nama kamu : ");
     String namaLuwh = input.nextLine();


     System.out.print("Alamat : ");
     String alamat = input.nextLine();


     System.out.print("Umur : ");
     int umur = input.nextInt();


     System.out.print("Prodi : ");
     String prodi = input.nextLine();

     System.out.print("=== NAMA LUWH ===");
     System.out.print("NAMA\t : "+ namaLuwh);
     System.out.print("ALAMAT\t : "+ alamat);
     System.out.print("UMUR\t : "+ umur);
     System.out.print("PRODI\t : "+ prodi);

    }
}
