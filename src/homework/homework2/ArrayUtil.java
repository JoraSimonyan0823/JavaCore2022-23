package homework.homework2;

public class ArrayUtil {
    public static void main(String[] args) {

        int[] array = {2, 8, 9, 7, -1, 21, 12, 22, 14, 45};
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
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("min. " + min);

        System.out.println();

        System.out.println("First: " + array[0]);
        int lastIndex = array.length - 1;
        System.out.println("Last: " + array[lastIndex]);
        System.out.print("Average : " + array[array.length / 2]);

        System.out.println();

        for (int x : array) {
            if (x % 2 == 0) {
                System.out.print(x + " ");
            }
        }

        System.out.println();

        for (int x : array) {
            if (x % 2 != 0) {
                System.out.print(x + " ");
            }
        }
        System.out.println();

        int evenCount = 0;
        for (int x : array) {
            if (x % 2 == 0) {
                evenCount++;
            }
        }
        System.out.println("Զույգերի քանակը : " + evenCount);

        int oddCount = 0;
        for (int x : array) {
            if (x % 2 != 0) {
                oddCount++;
            }
        }
        System.out.println("Կենտերի քանակը: " + oddCount);

        System.out.println();

        int sum = 0;
        for (int x : array) {
            sum += x;
        }
        System.out.println("Էլեմենտների գունարը : " + sum );
        System.out.print("էլեմենտների միջին թվաբանականը : " + sum / array.length);
    }
}


