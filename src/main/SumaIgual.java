public class SumaIgual {
    public static String suma (int[] nums) {
        String res = "";
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                sum = nums[i] + nums[j];
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 5, 3, 5, 7, 3, 9, 9, 8};
        System.out.println(suma(nums));
    }
}