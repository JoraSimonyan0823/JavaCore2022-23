package homework.homework7;

public class Calculator {
    double plus(double a, double c) {
        return a + c;
    }

    double minus(double a, double c) {
        return a - c;
    }

    int divide(int a, int c) {
        if (c == 0) {
            System.out.println("Թիվը չի բաժանվում 0-ի");
            return -1;
        }
        return a / c;
    }

    double multiply(double a, double c) {
        return a * c;
    }
}
