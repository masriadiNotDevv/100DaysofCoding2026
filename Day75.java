public class Day75 {
    public static void main(String[] args) {
        String kata1 = "Java";
        String kata2 = "java";
        String kalimat = "Belajar Pemrograman Java";
        String kosong = "";

        System.out.println("equals(): " + kata1.equals(kata2));
        System.out.println("equalsIgnoreCase(): " + kata1.equalsIgnoreCase(kata2));
       System.out.println("contains(): " + kalimat.contains("Java"));
        System.out.println("isEmpty(): " + kosong.isEmpty()); 
    }
}
