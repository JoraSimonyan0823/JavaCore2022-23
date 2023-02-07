package Group1.chapter8.simpleInheritance;

public class SimpleInheritance {
    public static void main(String[] args) {

        A superOb = new A();
        B subOb = new B();

        superOb.i = 10;
        superOb.j = 20;
        System.out.println("Содержимое обьекта superOb: ");
        superOb.showij();
        subOb.i = 7;
        subOb.j = 8;
        subOb.k = 9;
        System.out.println("Содержимое обьекта subOb: ");
        subOb.showij();
        subOb.showk();
        System.out.println();
        System.out.println("Сумма i, j и k в обьекте subOb: ");
        subOb.sum();
    }
}