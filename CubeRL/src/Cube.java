import java.awt.*;



public class Cube {

    private Facet[] facets;

    public Cube(){
        facets = new Facet[6];
        facets[0] = new Facet(new R3Vector(0,0,0),
                new R3Vector(1,0,0),
                new R3Vector(1,1,0),
                new R3Vector(0,1,0));
        facets[1] = new Facet(new R3Vector(1,0,1),
                new R3Vector(1,1,1),
                new R3Vector(1,1,0),
                new R3Vector(1,0,0));
        facets[2] = new Facet(new R3Vector(0,0,0),
                new R3Vector(0,1,0),
                new R3Vector(0,1,1),
                new R3Vector(0,0,1));
        facets[3] = new Facet(new R3Vector(0,0,0),
                new R3Vector(0,0,1),
                new R3Vector(1,0,1),
                new R3Vector(1,0,0));
        facets[4] = new Facet(new R3Vector(0,1,0),
                new R3Vector(1,1,0),
                new R3Vector(1,1,1),
                new R3Vector(0,1,1));
        facets[5] = new Facet(new R3Vector(0,0,1),
                new R3Vector(0,1,1),
                new R3Vector(1,1,1),
                new R3Vector(1,0,1));
    }


    public void rotate(double dx, double dy, double dz){

        facets[0].rotate(dx, dy, dz);

        facets[1].rotate(dx, dy, dz);

        facets[2].rotate(dx, dy, dz);

        facets[3].rotate(dx, dy, dz);

        facets[4].rotate(dx, dy, dz);

        facets[5].rotate(dx, dy, dz);

    }



    public void translate(double dx, double dy, double dz){

        facets[0].translate(dx, dy, dz);

        facets[1].translate(dx, dy, dz);

        facets[2].translate(dx, dy, dz);

        facets[3].translate(dx, dy, dz);

        facets[4].translate(dx, dy, dz);

        facets[5].translate(dx, dy, dz);

    }



    public void mulNum(double d){

        facets[0].mulNum(d);

        facets[1].mulNum(d);

        facets[2].mulNum(d);

        facets[3].mulNum(d);

        facets[4].mulNum(d);

        facets[5].mulNum(d);

    }

    public void draw(Graphics g){

//        for (int i = 0; i < 6; i++) {

//            facets[i].draw(g);

//        }



        facets[1].draw(g);

        facets[2].draw(g);

        facets[3].draw(g);

        facets[4].draw(g);

        facets[5].draw(g);

        g.setColor(Color.BLUE);

        facets[0].draw(g);

    }


}