package Group1.chapter7.overLoadCons2;

public class OverLoadCons2 {
    public static void main(String[] args) {
        Box mybox1 = new Box(10, 20, 150);
        Box mybox2 = new Box();
        Box mycube = new Box(7);
        Box myclone = new Box(mybox1);
        double vol;
        vol = mybox1.volume();
        System.out.println("Обьем mybox1 равен " + vol);
        vol = mybox2.volume();
        System.out.println("Обьем mybox2 равен " + vol);
        vol = mycube.volume();
        System.out.println("Обьем mycube равен " + vol);
        vol = myclone.volume();
        System.out.println("Обьем myclone равен " + vol);
    }
}
