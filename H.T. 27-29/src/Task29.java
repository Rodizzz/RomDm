import java.util.Scanner;

public class Task29 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число:");
        int g = in.nextInt();
        int a = 0;
        if(g>=1) a = g-1;
        if(g<=0) a = 0-g;
        System.out.print("Расстояние: " + a);
        in.close();
    }
}