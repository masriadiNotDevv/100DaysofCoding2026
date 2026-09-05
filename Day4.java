public class Day4 {
    public static void main(String[] args) {
        //  DAY 4
        //top 4 type data bilangan bulat 

        // 1. byte / jarak angka yang hnya kisaran -128 hingga 127 dan tidak boleh lebih 
        byte umur = 21; // 8bit // jika lebih dari -128 - 128 maka akan terjadi error 

        // 2. short / hanya kisaran -32.768 hingga 32.767
        short jumlahMhs = 23000; // 16bit
        
        // 3. Int / kisaran -2,147,483,648 hingga 2,147,483,647 dan ini typedata integer yg paling umum digunakan 
        int jumlahView = 23000020;  // 32bit

        // 4. long / typedata integer yg paling besar ,
        long jumlahPopulasiManusia = 10000000000000L; // 64bit , kenapa ada L ? , karena supaya java tau kalo typedata itu adalah long dan jika tidak memasukan karakter L maka akan terjadi error karena java menganggap kalo typedata itu cm int biasa

        // semua typedata diatas dihitung dari beberapa gabungan bit karena itu ukuran paling kacil yg dimengerti komputer dan bit ini hanya ada angka yaitu 0 dan 1 
        // kenapa ada typedata bgitu ? karena itu faktor dr jaman masih komputer menghemat penggunaan ram dan ke-paraktisan dalam memanajemen memori
        // jadi urutannya : byte < short < long < int , tpi yg sering dipake orang2 adlah int 
        }
}
