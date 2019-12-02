import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;
public class STAYA {
    //ident-отступ!
    int ident=30;
    private ArrayList<Bird> flock;
    public STAYA(int n){
        flock=new ArrayList<Bird>(n);
        Scanner s=new Scanner(System.in);

        System.out.println("1-pirate macaw; " +
                "2-black(grey) penguin;" +
                " 3- Jack sparrow; " +
                "0-End of choice");
        for (int i=0; ;i++ ){
            int x,y;
            System.out.println("Choose you're Fighter 1,2,3,0");
            int p= s.nextInt();
            do {
                //( Math.random() * (b-a) ) + a      [a;b)
                x = (int)((Math.random() * (Window.width-4*ident))+ident);
                y = (int)((Math.random() * (Window.height-4*ident))+ident);
            } while (localXY(x, y));
            if (p==0){
                break;
            }
            if (p==1) {
                flock.add(new Macaw((Names.lib.names[(int)(( Math.random() * (6)))]),x,y));
                if(Macaw.maxX < x) Macaw.maxX = x;
                if(Macaw.maxY < y) Macaw.maxY = y;
                if(Macaw.minX > x) Macaw.minX = x;
                if(Macaw.minY > y) Macaw.minY = y;

            }
            if (p==2) {
                flock.add(new Penguin((Names.libForPings.names[(int)(( Math.random() * (6)))]),x,y));
                if(Penguin.maxX<x) Penguin.maxX=x;
                if(Penguin.maxY<y) Penguin.maxY=y;
                if(Penguin.minX>x) Penguin.minX=x;
                if(Penguin.minY>y) Penguin.minY=y;
            }
            if (p==3){
                flock.add(new Vorobey((Names.libForVors.names[(int)(( Math.random() * (6)))]),x,y));
                if(Vorobey.maxX<x) Vorobey.maxX=x;
                if(Vorobey.maxY<y) Vorobey.maxY=y;
                if(Vorobey.minX>x) Vorobey.minX=x;
                if(Vorobey.minY>y) Vorobey.minY=y;
            }
        }



    }


    public void draw(Graphics g){
        for(int i=0; i< flock.size();i++){
            flock.get(i).draw(g);
            System.out.println(" Рисую ");
            if (Macaw.maxX!=0 && Macaw.maxY!=0) {
                g.setColor(Color.GREEN);
                System.out.println("Macaw: " + Macaw.minX + " " + Macaw.minY + " " + Macaw.maxX + " " + Macaw.maxY);
                g.drawRect(Macaw.minX, Macaw.minY, Macaw.maxX - Macaw.minX + 60, Macaw.maxY - Macaw.minY + 60);
            }
            if (Penguin.maxX!=0 && Penguin.maxY!=0) {
                System.out.println("Penguin: " + Penguin.minX + " " + Penguin.minY + " " + Penguin.maxX + " " + Penguin.maxY);
                g.setColor(Color.BLUE);
                g.drawRect(Penguin.minX, Penguin.minY, Penguin.maxX - Penguin.minX + 50, Penguin.maxY - Penguin.minY + 50);
            }
            if (Vorobey.maxX!=0 && Vorobey.maxY!=0) {

                System.out.println("Vorobey: " + Vorobey.minX + " " + Vorobey.minY + " " + Vorobey.maxX + " " + Vorobey.maxY);
                g.setColor(Color.GRAY);
                g.drawRect(Vorobey.minX, Vorobey.minY, Vorobey.maxX - Vorobey.minX + 40, Vorobey.maxY - Vorobey.minY + 40);
            }
            System.out.println("Wait my darling...");

        }

    }
    public boolean localXY(int x, int y){
        for (int i = 0; i < flock.size(); i++) {
            if(x >= flock.get(i).x  && x <= flock.get(i).x  && y >= flock.get(i).y  && y <= flock.get(i).y ) return true;
        }
        return false;
    }



}