public class Day86 {
    public static void main(String[] args) {
        String[] buah = {"Apel", "Mangga", "Jeruk", "Pisang"};
        String cari = "Jeruk";
        boolean ditemukan = false;

        for (int i = 0; i < buah.length; i++) {
            if (buah[i].equals(cari)) {
                System.out.println("Elemen \"" + cari + "\" ditemukan pada indeks ke-" + i);
                ditemukan = true;
                break;
            }
        }

        if (!ditemukan) {
            System.out.println("Elemen \"" + cari + "\" tidak ditemukan dalam array.");
        }
    }
}
