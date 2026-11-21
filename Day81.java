import  java.util.Scanner;

public  class Day81 {
    public static  void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.err.print("masukan jumlah data : ");
       int jumlah = in.nextInt();   
       String[] data = new String[jumlah];
       in.nextLine();
    for (int i = 0; i < data.length; i++) {
        System.out.print("masukan nama mhs " + (i + 1) + " : ");
        String nama = in.nextLine();
        data[i] = nama;
    }   
    for (int i = 0; i < data.length; i++) {
        System.out.println(data[i]);
    }
    
    }
}
