public class Inverso {
    public static int inverso (int num){
        for (int i = num; i > 0; i--){

        }
        return num;
    }
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};

        int[] inverso = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            inverso[i] = array[array.length - 1 - i];
        }

        System.out.println("Array original:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.println("Array en orden inverso:");
        for (int num : inverso) {
            System.out.print(num + " ");
        }
    }
}