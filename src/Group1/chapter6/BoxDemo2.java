package Group1.chapter6;

public class BoxDemo2 {
    public static void main(String[] args) {
        Box myBox1 = new Box(10,20,15);
        Box myBox2 = new Box(3,6,9);
        double vol;

        vol = myBox1.width * myBox1.height * myBox1.depth;
        System.out.println("Обьем равен " + vol);

        vol = myBox2.width * myBox2.height * myBox2.depth;
        System.out.println("Обьем равен " + vol);
    }
}
