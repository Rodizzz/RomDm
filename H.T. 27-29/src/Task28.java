import java.util.Scanner;

public class Task28
{
    public static void main(String[] args) {
        System.out.println("Введите число n");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println("Введите число i");
        int i = in.nextInt();
        System.out.println("Введите число p");
        int p = in.nextInt();
        if((n>i&&n<p)||(n<i&&n>p)||(n<i&&n<p&&p==i)||(n==p&&n<i)||(n==i&&n<p))
            System.out.println(n+" Второе по величине");
        if((p>i&&n<i)||(p<i&&n>i)||(i<p&&i<n&&n==p)||(i==n&&i<p)||(i==p&&i<n))
            System.out.println(i+" Второе по величине");
        if((n>p&&i<p)||(n<p&&i>p)||(p<i&&p<n&&n==i)||(p==n&&p<i)||(p==i&&p<n))
            System.out.println(p+" Второе по величине");
    }
}