package Group1.chapter5;

public class Break {
    public static void main(String[] args) {

        boolean t = true;

        first:
        {
            second:
            {
                third:
                {
                    System.out.println("Предшествует оператору break. ");
                    if (t) {
                        break second;
                    }
                    System.out.println("Этот оператор не будет выполнятся. ");
                }
                System.out.println("Этот оператор не будет выполнятся. ");
            }
            System.out.println("Этот оператор следует за блоком break. ");
        }
    }
}

