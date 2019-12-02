import javax.swing.*;
import java.awt.*;



public class Window extends JFrame {
    public static int width =1300;
    public static int height =800;

    private STAYA f;
    public Window(STAYA f){
        this.f= f;
        this.setTitle("Paint");
        this.setSize(width,height);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void paint(Graphics g){
        this.setSize(width,height);
        f.draw(g);
        System.out.println("Now, i'am drawing. Please wait...");


    }


}
