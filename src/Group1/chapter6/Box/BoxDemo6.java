package Group1.chapter6.Box;

public class BoxDemo6 {
    public static void main(String[] args) {
        Box6 mybox1 = new Box6();
        Box6 mybox2 = new Box6();
        double vol;
        vol = mybox1.volume();
        System.out.println("Обьем равен " + vol);
        vol = mybox2.volume();
        System.out.println("Обьем равен " + vol);

    }
}
