package homework.homework6;

public class ArrayUtil {
    int[] array = {2, 8, 9, 7, -1, 21, 12, 22, 14, 45};

    void allOfArray() {

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    void maxOfArray() {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.print("max. " + max);

        System.out.println();
    }

    void minOFfArray() {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("min. " + min);
    }

    void firstOfArray() {
        System.out.println("First: " + array[0]);
    }

    void lastOfArray() {

        int lastIndex = array.length - 1;
        System.out.println("Last: " + array[lastIndex]);
    }

    void averageOfArray() {
        System.out.print("Average : " + array[array.length / 2]);
        System.out.println();
    }

    void evenCountArray() {
        int evenCount = 0;
        for (int x : array) {
            if (x % 2 == 0) {
                evenCount++;
            }
        }
        System.out.println("Զույգերի քանակը : " + evenCount);
    }

    void oddCountArray() {
        int oddCount = 0;
        for (int x : array) {
            if (x % 2 != 0) {
                oddCount++;
            }
        }
        System.out.println("Կենտերի քանակը: " + oddCount);
    }

    void sumArray() {
        int sum = 0;
        for (int x : array) {
            sum += x;
        }
        System.out.println("Էլեմենտների գումարը : " + sum);
    }

    void averageSumArray() {
        int sum = 0;
        for (int x : array) {
            sum += x;
        }
        System.out.print("էլեմենտների միջին թվաբանականը : " + sum / array.length);
    }
}