/*
day 5 typedata pecahan 
float dan doule
*/

public class Day5 {
    public static void main(String[] args) {
        // 1. Typedata double
        double ukuran_sepatu = 7.2;
        // secara default double adlah typedata pecahan pada java dgn 64bit , 
        // sedikit lebih lambat karena mengolah nilai yg tinggi 
        // dan mempunyai nilai yg presisi cocok untuk program yg membutuhkan nilai  akurasi yg sngat tinggi seperti data analys, perhitungan sains 
        
        // 2. Typedata float
        float tinggi = 7.2f;
        // sedangkan float memiliki ukuran  memori 32bit, dan sangat cepat mempreses suatu nilai
        // tapi typedata float tingkat akurasinya rendah dari double
        //  makanya pada akhir float biasanya ditandai dengan huruf f agar compiler tau kalo nilai ini harus di olah dalam bentuk float bukan double krna di java nilai pecahan akan otomatis di anggap double 
        float tes = 7.2; // contohnya seperti ini error ygy kalo gada "f" di akhir , 
        // biasanya float ini dgunakan pada game engine , embedded system yg gk terllu butuh nilai yg amat presisi
        // 
    }
}