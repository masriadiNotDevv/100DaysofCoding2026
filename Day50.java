import java.util.Scanner;
public class Day50 {
public static void main(String[] args) { 
Scanner in = new Scanner(System.in);
System.err.print("Masukan angka : "); 
int angka = in.nextInt();
String jenisBilangan = angka%2==0? " Angka Genap" : "angka ganjil"; 
System.err.println(jenisBilangan);}}
