package Group1.chapter6.Box;

public class Box7 {
    double width;
    double height;
    double depth;

    Box7(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    double volume() {
        return width * height * depth;
    }
}
