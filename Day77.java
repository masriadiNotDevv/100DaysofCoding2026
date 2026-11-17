public class GabunganMethodString {
    public static void main(String[] args) {
        String mentah = "   Belajar Pemrograman Java   ";
        String teks = mentah.trim(); 

        System.out.println("Teks bersih: '" + teks + "'");
        System.out.println("Panjang (length): " + teks.length());
        System.out.println("Huruf Besar (toUpperCase): " + teks.toUpperCase());
        System.out.println("Huruf Kecil (toLowerCase): " + teks.toLowerCase());
        
        System.out.println("Apakah kosong? (isEmpty): " + teks.isEmpty());
        System.out.println("Mengandung 'Java'? (contains): " + teks.contains("Java"));
        System.out.println("Sama persis? (equals): " + teks.equals("belajar pemrograman java"));
        System.out.println("Sama (abaikan huruf besar/kecil)? (equalsIgnoreCase): " + teks.equalsIgnoreCase("belajar pemrograman java"));

        System.out.println("Potong teks (substring 8-19): " + teks.substring(8, 19));
        System.out.println("Ganti kata (replace): " + teks.replace("Java", "Python"));
        System.out.println("Karakter indeks ke-3 (charAt): " + teks.charAt(3));
        System.out.println("Posisi indeks 'Java' (indexOf): " + teks.indexOf("Java"));

        String[] kataArray = teks.split(" ");
        System.out.println("Pecah kata pertama (split): " + kataArray[0]);
    }
}
