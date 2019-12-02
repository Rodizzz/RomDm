import java.util.Scanner;
public class Task {
    public static void task(String[] args);{
        System.out.println("Hello darling, please enter the numbers");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        if(a==b||a==n||b==n)
            System.out.println("Nope,we don't need same numbers");
            else System.out.println("Good boy");
            in.close();
    }
}
