import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите числа:");
        double n = in.nextDouble();
        double k = 0;
        if (n >= 1) k = n - 1;
        if (n <= 0) k = 0 - n;
        System.out.print("Количество максимальных: " + k);
        in.close();
    }
}