package homework.homework1;

public class FigurePainter {

    public static void main(String[] args) {
//       figure 1
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j <= i; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        figure 3
        int n = 5;
//        for (int i = 0; i < n; i++) {
//            for (int j = i; j < n; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
        // figure 2
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}



