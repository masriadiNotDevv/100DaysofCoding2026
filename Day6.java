public class Day6 {
public static void main(String[] args) {
/*
Day6 type data char dan boolean
*/

// 1. Char / typedata char yg valuenya hanya bisa di isi satu karakter saja 

char grade = 'A'; // dan jika mau memberikan karakter ' atau " itu tidak bsa dimasukan asal ke dalam value char maka dilakukan escape contoh : 
char singleQt = '\'';
char doubleQt = '\"';

// 2. boolean typedata yg hanya berisi nilai true dan false atau suatu kondisi dinyatakan benar ( true) dan jika tidak ( false) 

boolean benar = 1 < 5; // apakah 1 lebih kecil dripada 5 ? jika benar maka nilainya true

boolean salah = 1 > 5; // apakah 1 lebih besar daripada 5 ? jika tidak maka nilainya akan false

/* 
typedata boolean sangat sering 
dipakai dalam pemrograman khusunya 
di perulangan while, nested if , 
validasi suatu input dan sebagainya
*/

System.out.println("1 < 5 ? : " + benar); // output true
System.out.println("1 > 5 ? : " + salah); // output false


}

}