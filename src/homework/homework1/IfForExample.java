package homework.homework1;

public class IfForExample {
    public static void main(String[] args) {
        int a, b;
        a = 80;
        b = 70;
        if (a > b) {
            System.out.println("max." + a);
        } else {
            System.out.println("max. " + b);
        }

        if (a > b) {
            for (int i = b; i <= a; i++) {
                System.out.println(i);
            }
        } else {
            for (int i = a; i <= b; i++) {
                System.out.println(i);
            }
        }
        System.out.println((char) a);
        System.out.println((char) b);
        if (a == b) {
            System.out.println("a հավասար է b");
        } else {
            System.out.println("a հավասար չէ  b");
        }
    }
}


