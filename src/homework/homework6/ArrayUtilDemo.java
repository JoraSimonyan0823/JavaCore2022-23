package homework.homework6;

public class ArrayUtilDemo {
    public static void main(String[] args) {
        int[] array = {2, 8, 9, 7, -1, 21, 12, 22, 14, 45};
        ArrayUtil infoArray = new ArrayUtil();

        infoArray.allOfArray(array);
        infoArray.maxOfArray(array);
        infoArray.minOfArray(array);
        infoArray.firstOfArray(array);
        infoArray.lastOfArray(array);
        infoArray.averageOfArray(array);
        infoArray.evenCountArray(array);
        infoArray.oddCountArray(array);
        infoArray.sumArray(array);
        infoArray.averageSumArray(array);

    }
}

