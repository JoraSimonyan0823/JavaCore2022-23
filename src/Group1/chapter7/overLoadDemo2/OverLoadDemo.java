package Group1.chapter7.overLoadDemo2;

public class OverLoadDemo {
    void test() {
        System.out.println("Параметры отсуствуют. ");
    }

    void test(int a, int b) {
        System.out.println("a и b: " + a + " " + b);
    }

    void test(double a) {
        System.out.println("Внутренеее преобразование при вызове." +
                " test(double) a: " + a);
    }
}
