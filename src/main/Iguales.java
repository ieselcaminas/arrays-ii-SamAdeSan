import java.util.Arrays;public class Iguales {
    public static void main(String[] args) {
        int[] vector1 = {1, 2, 3, 4, 5};
        int[] vector2 = vector1.clone();
        if (Arrays.equals(vector1, vector2)) {
            System.out.println("Los vectores son iguales.");
        }else {
            System.out.println("Los vectores no son iguales.");
        }
    }
}
