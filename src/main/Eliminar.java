import java.util.Arrays;
public class Eliminar {
    public static void main(String[] args) {
        int [] nums = {1, 2, 3, 4, 5};
        int posicion = 2;
        int aux = nums[posicion];
        for (int i = 0; i < nums.length; i++) {
            nums [i] = nums[i] + 1;
        }
        aux = nums[nums.length - 1];
        System.out.println(Arrays.toString(nums));
    }
}
