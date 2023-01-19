package homework.homework7;

public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.plus(5, 6));
        System.out.println(calculator.minus(70, 45));
        System.out.println(calculator.divide(16, 4 ));
        System.out.println(calculator.divide(10, 0));
        System.out.println(calculator.multiply(4, 25));
    }
}
