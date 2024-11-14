public class Duplicados {
    public static String duplicados (int [] nums){
        String res = "";
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    res += nums[i] + " ";
                }
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 2, 3, 8, 2, 10, 5};
        System.out.println(duplicados(nums));
    }
}