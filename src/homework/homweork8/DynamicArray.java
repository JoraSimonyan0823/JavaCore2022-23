package homework.homweork8;

public class DynamicArray {

    private int[] array = new int[10];
    private int size = 0;

    public void add(int value) {
        if (size == array.length) {
            extend();
        }
        array[size++] = value;
    }

    private void extend() {
        int[] tmp = new int[array.length + 10];
        for (int i = 0; i < size; i++) {
            tmp[i] = array[i];
        }
        array = tmp;
    }

    public int getByIndex(int index) {
        if (index < 0 || index > size - 1) {
            System.out.println("Wrong Index");
            return -1;
        }
        return array[index];
    }
    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");

        }
    }

}

