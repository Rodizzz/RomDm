import java.awt.*;

abstract class Bird {

    protected int x;
    protected int y;
    protected int size=50;
    protected Color color = Color.black;
    public Bird(){
        System.out.println("I'm a bird");
    }
    public abstract void  fly();


    public void draw(Graphics g){
        g.setColor(color);
        g.fillRect(x,y,size,size);
    }
}
