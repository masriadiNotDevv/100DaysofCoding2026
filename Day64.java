public class Day64 {
    public static void main(String[] args) {
        int N = 5;
        int faktorial = 1;

        for (int i = 1; i <= N; i++) {
            faktorial *= i;   }
        System.out.println("Faktorial dari " + N + " (!" + N + ") adalah: " + faktorial);
    }
}
