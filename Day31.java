public class Day31 {
    public static void main(String[] args) {
        int umur = 20;
        boolean punyaKtp = true;
        boolean validasiUmur = umur >= 18 && punyaKtp;
        
        boolean punyaTiket = true;
        boolean punyaUndangan = false;
        boolean bisaMasuk =  punyaUndangan || punyaTiket;

        boolean isLogin = true;

    
        System.out.println(validasiUmur);
        System.out.println(bisaMasuk);
        System.out.println(!isLogin);

    }
}
