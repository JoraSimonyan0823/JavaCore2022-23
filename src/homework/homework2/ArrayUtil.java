package homework.homework2;

public class ArrayUtil {
    public static void main(String[] args) {

        int[] array = {2, 8, 9, 7, -7, -1, 21, 12, 22, 14};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println();

        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.print("max. " + max);

        System.out.println();
        int min = array[0];
        for (int i = 0; i < array.length ; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("min. " + min);
    }
}


