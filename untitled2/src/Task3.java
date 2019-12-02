
import java.util.Scanner;
public class Task3 {
    public static void main(String[]args){
    System.out.println("Welcome to the club boddy");
    Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int k = 0;
        int max1 = 0;
        if(n>=a&&n>=b) max1 = n;
        if(n<=a&&b<=a) max1 = a;
        if(a<=b&&n<=b) max1 = b;
        if(n==max1) k++;
        if(a==max1) k++;
        if(b==max1) k++;
        System.out.print("Nevermind= " + k);
        in.close();
    }
}
