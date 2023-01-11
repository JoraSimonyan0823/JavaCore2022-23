package homework.homework6;

public class ArrayUtilDemo {
    public static void main(String[] args) {
        int[] array = {2, 8, 9, 7, -1, 21, 12, 22, 14, 45};
        ArrayUtil all = new ArrayUtil();
        ArrayUtil max = new ArrayUtil();
        ArrayUtil min = new ArrayUtil();
        ArrayUtil first = new ArrayUtil();
        ArrayUtil last = new ArrayUtil();
        ArrayUtil average = new ArrayUtil();
        ArrayUtil evenCount = new ArrayUtil();
        ArrayUtil oddCount = new ArrayUtil();
        ArrayUtil sum = new ArrayUtil();
        ArrayUtil averageSum = new ArrayUtil();

        all.allOfArray(array);
        max.maxOfArray(array);
        min.minOfArray(array);
        first.firstOfArray(array);
        last.lastOfArray(array);
        average.averageOfArray(array);
        evenCount.evenCountArray(array);
        oddCount.oddCountArray(array);
        sum.sumArray(array);
        averageSum.averageSumArray(array);

        // Մի քանի բան փորձելուց հետո գտա որ
        // կարող ենք մի անգամ հայտարարենք ու բոլորի համար օգտագորժենք

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

