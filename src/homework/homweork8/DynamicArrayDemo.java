package homework.homweork8;

public class DynamicArrayDemo {
    public static void main(String[] args) {
        DynamicArray da = new DynamicArray();
        da.add(1);
        da.add(2);
        da.add(3);
        da.add(4);
        da.add(5);
        da.add(6);
        da.add(7);
        da.add(8);
        da.add(9);
        da.add(10);
        da.add(11);
        da.add(12);
        System.out.println(da.getByIndex(11));
        System.out.println(da.getByIndex(33));
        da.print();
    }
}

