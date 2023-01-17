package Group1.chapter6;

public class BoxDemo5 {
    public static void main(String[] args) {
        Box myBox1 = new Box(10,20,15);
        Box myBox2 = new Box(3,6,9);
        double vol;

        myBox1.sethDim(10, 20, 15);
        myBox2.sethDim(3, 6, 9);
        vol = myBox1.volume();
        System.out.println("Обьем равен " + vol);
        vol = myBox2.volume();
        System.out.println("Обьем равен " + vol);
    }
}
