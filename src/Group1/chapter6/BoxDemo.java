package Group1.chapter6;

public class BoxDemo {
    public static void main(String[] args) {
        Box myBox = new Box(10,20,15);
        double vol;
        vol = myBox.width * myBox.height * myBox.depth;
        System.out.println("Обьем равен " + vol);
    }
}
