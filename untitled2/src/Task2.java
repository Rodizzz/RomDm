import java.util.Scanner;
public class Task2 {
    public static void main(String[]args){
    System.out.println("Hello,let's find medium number");
    Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int n = in.nextInt();
        if (a==b||b==n||n==a) {System.out.println("We need not the same numbers");}
        else
        if (a > b && a < n || a < b && a > n)
            System.out.println(a);
        else
        if (b > a && b < n || b < a && b > n)
            System.out.println(b);
        else
            System.out.println(n);
        in.close();
    }

}
