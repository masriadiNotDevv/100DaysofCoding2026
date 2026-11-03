public class Day63 {
    public static void main(String[] args) {
        int M = 2;
        int N = 3; 
        int hasil = 1;

        for (int i = 1; i <= N; i++) {
            hasil *= M;
        }

        System.out.println(M + " pangkat " + N + " adalah: " + hasil);
    }
}
