package Group1.chapter6.Box;

public class Box5 {
    double width;
    double height;
    double depth;
    double volume() {
        return  width*height*depth;
    }
    void setDim(double w, double h,double d) {
        width = w;
        height = h;
        depth = d;

    }
}
