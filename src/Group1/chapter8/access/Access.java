package Group1.chapter8.access;

public class Access {
    public static void main(String[] args) {

        B subOb = new B();
        subOb.setij(10,12);
        subOb.sum();
        System.out.println("Сумма равна " + subOb.total);
    }
}
