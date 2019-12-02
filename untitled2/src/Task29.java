import java.util.Scanner;

public class Task29 {

    public static void main(String[] args) {
        four();
    }
    static void four(){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число:");
        int n = in.nextInt();
        int k = 0;
        if(n>=1) k = n-1;
        if(n<=0) k = 0-n;
        System.out.print("Расстояние: " + k);
        in.close();
    }
}