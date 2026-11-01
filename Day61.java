public class day61 {
    public static void main(String[] args) {
        int N = 5;
        int faktorial = 1;

        for (int i = 1; i <= N; i++) {
            faktorial *= i; 
        }

        System.out.println("Hasil perkalian angka dari 1 sampai " + N + " adalah: " + faktorial);
    }
}
