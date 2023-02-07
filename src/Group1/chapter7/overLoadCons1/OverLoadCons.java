package Group1.chapter7.overLoadCons1;

public class OverLoadCons {
    public static void main(String[] args) {
        Box mybox1 = new Box(10, 20, 15);
        Box mybox2 = new Box();
        Box mybox3 = new Box(7);
        double vol;
        vol = mybox1.volume();
        System.out.println("Обьем mybox1 равен " + vol);
        vol = mybox2.volume();
        System.out.println("Обьем mybox2 равен " + vol);
        vol = mybox3.volume();
        System.out.println("Обьем mybox3 равен " + vol);

    }
}
