public class Day85 {
    public static void main(String[] args) {
        int[] data = {3,2,6,3,1};
        int min = data[0];
        for (int i = 0; i < data.length; i++) {
            if (data[i] < min) {
                min = data[i];
            }
        }
        System.out.println("min : " + min);
    }
}
