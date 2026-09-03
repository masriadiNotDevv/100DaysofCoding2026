/*
day 3 ,
Penggunaan Escape Sequence (\n, \t, dan lain lain).

*/
public class Day3 {
    public static void main(String[] args) {
        // Escape sequence adalah kombinasi karakter yang diawali dengan backslash \ untuk menghasilkan karakter atau efek khusus di dalam String

        // 1. contoh escape \n atau NewLine untuk baris baru kayak : 
        System.out.println("halo, \nwok"); 
        /* 
        output diatas bakal jadi :
        | halo 
        | wok 
        karena sebelum "wok" ada escape \n dan "wok " ke baris baru

        */
       
        // 2. contoh escape \t untuk tab yg dimana kalo kita nambahin ke dalam string bakal maju ke depan kyak kita nekan tombol tab , contohnyav :
        System.out.println("NAMA\t: Ambatucode"); // outputnya bakal jadi "NAMA   : Ambatucode", kayak kena tab gtu 

        // 3. contoh escape double quote \" fungsinya buat msukin simbol " petik 2 ke dalam string, karena java error kalo nambahin simbol itu dia nganggap kalo itu akhir dr sebuah string , contohnya 
        // System.out.println("menambahkan ke "my bini " "); nah ini error krna simbol " petik dua dianggap akhir string , cara fixnya :
        System.out.println("menambahkan ke \"my bini \" "); // nah ini bru bisa karena ada escape \"" hal ini juga sama di dengan simbol \''

        // 4. escape \\ double slash , biasanya buat nentuin path yg pake \\ 
        // System.out.println("C:\adi\java");  ini dia error krna dia nganggap kalo simbol \ kita mau melakukan escape , dan cara yg benar  :
        System.out.println("C:\\adi\\java"); // solusinya pake double slash biar bs di print dan outputnya jadi "C:\adi\java"

 // 5. backspace \b buat hapus 1 karakter didepan , contoh kodenya 
 System.out.println("ABC\bD"); // outputnya "ABC" krena \b ngapus D 

 //6. space \s buat nambahin spasi ke dalam string contohnya :
 System.out.println("Hello\sWorld"); // nah ini dia bakal "Hello World" jadi ada spasi gtu 


 // 7. carriage return , \r mengembalikan posisi cursor ke awal baris.
 System.out.print("Hello\rWorld");
 // outputnya 
 /*
 Hello
hell o   ← "hell" menimpa 4 karakter, "o" masih tersisa
hel lo
he llo
h ello
w ello
wo llo
world
 */

// 8. Single quote \' , konsepnya sama dengan \".
//    \' digunakan ketika simbol ' perlu dianggap sebagai karakter literal,
//    bukan sebagai penutup char.
//
//    Contoh:
//    char simbol = '\''; // outputnya hanya karakter '
//
//    Sedangkan pada String, simbol ' tidak perlu di-escape:
//    System.out.print("I'm Adi"); // valid, tidak error

char simbol = '\''; // outputnya hanya karakter '
  


// 9. form feed \f fungsinya untuk memberi perintah ke printer agar maju ke halaman/form berikutnya.
// contohnya :
System.out.print("Halaman 1\fHalaman 2");





    }
}