import java.util.Scanner; 
public class Task1 {

public static void main(String[] args) { 
System.out.println("Hello darling. Please, enter the nombers :3"); 
Scanner in = new Scanner(System.in); 
int n = in.nextInt(); 
int a = in.nextInt(); 
int b = in.nextInt(); 
if (a==n||a==b||b==n) 
System.out.println("Nope, We don't need same numbers"); 
else System.out.println("Yes,good boy"); 
in.close(); 
} 
}