public class  Day9{
    public static void main(String[] args) {
        // Final variabel 
        // fungsinya supaya variabel yg kita buat dengan awal final itu sudah tidak bisa di ubah lagi valuenya 

        int angka = 10;
        final int angka2 = 10; // contoh penggunaan final
        final String negara = "indonesia";
        final double pi = 3.14;

         System.out.println("angka: " + angka);
         System.out.println("Negara: " + negara);
         System.out.println("Nilai Pi: " + pi);
         angka += 900;
       //  angka2 += 900;  nilai dari angka2 udh gk bs lagi di ubah nilainya karena bersifat final
         System.out.println("Tahun sekarang: " + angka);

    }

}
