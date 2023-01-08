package homework.homework4;

public class CharArrayExample {
    public static void main(String[] args) {

        char[] chars = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e'};
        char c = 'o';

        int count = 0;
        for (char aChar : chars) {
            if (aChar == c) {
                count++;
            }
        }
        System.out.println("o տառի քանակը: " + count);

        char[] chars2 = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e'};

        System.out.print(chars2[chars2.length / 2] + " " + chars2[(chars2.length / 2 + 1)]);

        System.out.println();

        char[] chars3 = {'j', 'a', 'v', 'a', 'l', 'o', 'l', 'y'};
        if (chars3[chars3.length - 2] == 'l' && chars3[chars3.length - 1] == 'y') {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        char[] text = {' ', ' ', 'b', 'a', 'r', 'e', 'v', ' ', ' '};

        for (char aChar : text) {
            if (aChar != ' ') {
                System.out.print(aChar + " ");
            }
        }
    }
}
