import java.util.Scanner;
public class Task1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите 1 число");
        int n = in.nextInt();
        System.out.println("Введите 2 число");
        int i = in.nextInt();
        System.out.println("Введите 3 число");
        int p = in.nextInt();
        if (n == i || n == p || i == p) {
            System.out.println("Есть");
        }
        else{
            System.out.println("Нет");
        }
    }
}
