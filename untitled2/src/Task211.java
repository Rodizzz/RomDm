import java.util.Scanner;

public class Task211 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a, b, c, d;
        double x1, x2;
        System.out.println("a=");
        a = in.nextDouble();
        System.out.println("b=");
        b = in.nextDouble();
        System.out.println("c=");
        c = in.nextDouble();
        d = b * b - 4 * a * c;
        if (d > 0) {
            x1 = (-b - Math.sqrt(d)) / (2 * a);
            x2 = (-b + Math.sqrt(d)) / (2 * a);
            System.out.println("x1=" + x1 + ",x2=" + x2);
        } else if (d == 0) {
            double x;
            x = -b / (2 * a);
            System.out.println("x =" + x);
        } else {
            System.out.println("Уравнение не имеет действительных корней!");
        }
    }
}