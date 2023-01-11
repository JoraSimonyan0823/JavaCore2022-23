package homework.homework6;

public class ArrayUtil {

    void allOfArray(int[]array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    void maxOfArray(int[]array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.print("max. " + max);

        System.out.println();
    }

    void minOfArray(int[]array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("min. " + min);
    }

    void firstOfArray(int[]array) {
        System.out.println("First: " + array[0]);
    }

    void lastOfArray(int[]array) {

        int lastIndex = array.length - 1;
        System.out.println("Last: " + array[lastIndex]);
    }

    void averageOfArray(int[]array) {
        System.out.print("Average : " + array[array.length / 2]);
        System.out.println();
    }

    void evenCountArray(int[]array) {
        int evenCount = 0;
        for (int x : array) {
            if (x % 2 == 0) {
                evenCount++;
            }
        }
        System.out.println("Զույգերի քանակը : " + evenCount);
    }

    void oddCountArray(int[]array) {
        int oddCount = 0;
        for (int x : array) {
            if (x % 2 != 0) {
                oddCount++;
            }
        }
        System.out.println("Կենտերի քանակը: " + oddCount);
    }

    void sumArray(int[]array) {
        int sum = 0;
        for (int x : array) {
            sum += x;
        }
        System.out.println("Էլեմենտների գումարը : " + sum);
    }

    void averageSumArray(int[]array) {
        int sum = 0;
        for (int x : array) {
            sum += x;
        }
        System.out.print("էլեմենտների միջին թվաբանականը : " + sum / array.length);
    }
}