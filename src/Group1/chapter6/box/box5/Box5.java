package Group1.chapter6.box.box5;

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
