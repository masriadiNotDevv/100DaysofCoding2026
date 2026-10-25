
import java.util.Scanner;

public class Day54 {
public static void main(String[] args) {
Scanner in = new Scanner(System.in);
System.out.print("Masukan angka X : ");
int x = in.nextInt();

System.out.print("Masukan angka Y : ");
int y = in.nextInt();

System.out.print("Masukan angka Z : ");
int z = in.nextInt();

int xAwal = x;
if (y > xAwal) {
 x += 1;
}
if (z > xAwal) {
 x += 2;
}
if (y < xAwal) {
x -= 1;
}
if (z  < xAwal ) {
x -= 2;
}

System.out.println(x);
}}
