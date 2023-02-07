package Group1.chapter8.useSuper;

public class B extends A {
    int i;
    B(int a, int b) {
        super.i = a;
        i = b;
    }
    void show() {
        System.out.println("Член i в супперклассе: " + super.i);
        System.out.println("Член i в подклассе: " + i);
    }
}
