import java.util.Scanner;
public class Task5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int k = 0;
        int n,
                i = 2,
                x = 2;
        System.out.println(" ");
        n = input.nextInt();
        for(i = 2, x = 2; i <= n; i++) {
            for(x = 2; x < i; x++, k++) {
                if(i % x == 0) {
                    break;
                }
            }
        }
        System.out.printf("\n%d is prime", x);
    }
}