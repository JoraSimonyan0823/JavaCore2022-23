package homework.homework5;

public class ArraySpaceExample {
    public static void main(String[] args) {
        char[] spaceArray = {' ',' ', 'c', 'a', 't', ' ', 'b', 'i', ' ', 'b', ' ', ' ', ' '};
        int first = 0;
        int last = spaceArray.length - 1;

        while (first < spaceArray.length && spaceArray[first] == ' ') {
            first++;
        }
        while (last >= 0 && spaceArray[last] == ' ') {
            last--;
        }
        char[] result = new char[last - first + 1];
        for (int i = first; i <= last; i++) {
            result[i - first] = spaceArray[i];
        }
        for (char array : result) {
            System.out.print(array);
        }
    }
}


