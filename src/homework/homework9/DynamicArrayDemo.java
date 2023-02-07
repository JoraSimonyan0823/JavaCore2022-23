package homework.homework9;

public class DynamicArrayDemo {
    public static void main(String[] args) {
        DynamicArray da = new DynamicArray();
        for (int i = 0; i < 10; i++) {
            da.add(i + 1);
        }
        System.out.println(da.getByIndexValue(10));
    }
}

