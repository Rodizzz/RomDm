import java.util.Scanner;
public class Task3 {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите числа:");
        int n = in.nextInt();
        int i = in.nextInt();
        int p = in.nextInt();
        int k = 0;
        int max1 = 0;
        if(n>=i&&n>=p) max1 = n;
        if(p<=i&&n<=i) max1 = i;
        if(n<=p&&i<=p) max1 = p;
        if(n==max1) k++;
        if(i==max1) k++;
        if(p==max1) k++;
        System.out.print("Количество максимальных: " + k);
        in.close();
    }
}