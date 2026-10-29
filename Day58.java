public class Day58 {
    public static void main(String[] args) {
        int N = 10;

        System.out.println("Nilai N = " + N);
      
       System.out.print("Angka Ganjil (Menurun) : ");
        for (int i = N; i >= 1; i--) {
            if (i % 2 != 0) { 
                System.out.print(i + " ");
            }
        }
        System.out.println();

            System.out.print("Angka Genap (Menurun)  : ");
        for (int i = N; i >= 1; i--) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
