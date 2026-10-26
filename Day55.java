public class Day55 {
    public static void main(String[] args) {


             for (int i = 1; i <= 5; i++) {
            
            
            if (i == 2) {
                System.out.println("Angka 2 dilewati (continue).");
                continue;
            }

               if (i == 4) {
                System.out.println("Angka 4 tercapai, perulangan dihentikan (break).");
                break;
            }

            System.out.println("Nilai i saat ini: " + i);
        }

        System.out.println("\nPerulangan selesai.");

          System.out.println("Program dihentikan sepenuhnya (return).");
        return;
    }
}
