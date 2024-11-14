import java.util.Arrays;

public class MoverCeros {
    public static int moverAlFinal(int[] array) {
        int indice = 0;
        for (int num : array) {
            if (num != 0) {
                num = array[indice++];
            }
        }
        while (indice < array.length){
            array[indice++] = 0;
        }
        return indice;
    }
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        moverAlFinal(array);
        System.out.println(Arrays.toString(array));
    }
}
