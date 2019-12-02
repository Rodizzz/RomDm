import java.awt.*;

public class Penguin extends Bird {
    private static String name ;
    private static int num = 0;
    public static int maxX = 0;
    public static int maxY = 0;
    public static int minX = Window.width+100;
    public static int minY = Window.height+100;

    public Penguin(String str,int x,int y){
        this.name=str;
        System.out.println("My name "+ this.name + "!");
        num++;
        System.out.println("I'am penguin number "+num);
        size = 50;
        color = Color.blue;
        this.fly();
        this.x=x;
        this.y=y;
    }
    public void fly(){
        System.out.println("I can't fly, but i can walk");
    }
    public void draw(Graphics g){

        g.setColor(color);
        g.fillRect(x,y,size,size);
        g.setColor(Color.white);
        g.fillRect(x+20,y+20,8,8);
    }
}
