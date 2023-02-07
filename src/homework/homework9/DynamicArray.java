package homework.homework9;

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

    public void deleteByIndex(int index) {
        if (index < 0 || index > size - 1) {
            System.out.println("Wrong Index");
            return;
        }
        for (int i = index + 1; i < size; i++) {
            array[i - 1] = array[i];
        }
        size--;
        System.out.println();
    }

    public void set(int index, int value) {
        if (index < 0 || index > size - 1) {
            System.out.println("Wrong Index");
            return;
        }
        array[index] = value;
        System.out.println();
    }

    public void add(int index, int value) {
        if (index < 0 || index > size - 1) {
            System.out.println("Wrong Index");
            return;
        }
        if (size == array.length) {
            extend();
        }
        for (int i = size - 1; i >= index; i--) {
            array[i] = array[i - 1];
        }
        array[index] = value;
        size++;
    }

    public boolean exists(int value) {
        for (int i = 0; i < size; i++) {
            if (array[i] == value) {
                return true;
            }
        }
        return false;
    }

    public int getByIndexValue(int value) {
        for (int i = 0; i < size; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }
}
