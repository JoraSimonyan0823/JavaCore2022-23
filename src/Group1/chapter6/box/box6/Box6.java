package Group1.chapter6.box.box6;

public class Box6 {
    double width;
    double height;
    double depth;

    Box6() {
        System.out.println("Конструктирование обьекта Box");
        width = 10;
        height = 10;
        depth = 10;
    }

    double volume() {
        return width * height * depth;
    }
}
