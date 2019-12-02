import java.util.Scanner;
public class Task {
    public static void main(String[] args) {

        {
            System.out.println("Hello darling, please enter the numbers");
            Scanner in = new Scanner(System.in);
            int a = in.nextInt();
            int b = in.nextInt();
            System.out.println(a);
            System.out.println(b);
            a = a + b;
            b = b - a;
            b = -b;
            a = a - b;
                System.out.println(a);
            System.out.println(b);
            in.close();
        }
    }
}