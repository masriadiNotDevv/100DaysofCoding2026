public class Day59 {
    public static void main(String[] args) {
        int N = 20;
        int M = 3; 

        System.out.print("Kelipatan " + M + " dari 1 sampai " + N + " : ");
        for (int i = 1; i <= N; i++) {
            if (i % M == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
