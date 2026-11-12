public class Day72 {
    public static void main(String[] args) {
        int B = 3;
        int K = 5;
        for (int i = 1; i <= B; i ++) {
            for (int j = 1; j <= K; j++) {
                System.err.print(i % 2 == 0 ? "0" : "#");
            }
            System.err.println(i % 2 == 0 ? "0" : "#");
        }
    }
}
