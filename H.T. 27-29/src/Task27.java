import java.util.Scanner;

public class Task27
{
    public static void main(String[] args) {
        System.out.println("Введите число a");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        System.out.println("Введите число b");
        int b = in.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("a=" + a);
        System.out.println("b=" + b);
        in.close();
    }
}