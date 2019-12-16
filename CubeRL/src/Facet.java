import java.awt.*;



public class Facet {

    private R3Vector[] vertex;


    public Facet(R3Vector v1, R3Vector v2, R3Vector v3, R3Vector v4) {

        vertex = new R3Vector[4];

        vertex[0] = v1;

        vertex[1] = v2;

        vertex[2] = v3;

        vertex[3] = v4;

    }

    public void out() {

        vertex[0].printVector();

        System.out.println(" - ");

        vertex[1].printVector();

        System.out.println("\n");


        vertex[1].printVector();

        System.out.println(" - ");

        vertex[2].printVector();

        System.out.println("\n");


        vertex[2].printVector();

        System.out.println(" - ");

        vertex[3].printVector();

        System.out.println("\n");


        vertex[3].printVector();

        System.out.println(" - ");

        vertex[0].printVector();

        System.out.println("\n");

    }


    public void rotate(double ux, double uy, double uz) {

        vertex[0].rotate(ux, uy, uz);

        vertex[1].rotate(ux, uy, uz);

        vertex[2].rotate(ux, uy, uz);

        vertex[3].rotate(ux, uy, uz);

    }


    public void translate(double dx, double dy, double dz) {

        vertex[0].translate(dx, dy, dz);

        vertex[1].translate(dx, dy, dz);

        vertex[2].translate(dx, dy, dz);

        vertex[3].translate(dx, dy, dz);

    }


    public void mulNum(double n) {

        vertex[0].mulNum(n);

        vertex[1].mulNum(n);

        vertex[2].mulNum(n);

        vertex[3].mulNum(n);

    }


    public R3Vector normally() {

        R3Vector a = new R3Vector(vertex[0].x - vertex[1].x, vertex[0].y - vertex[1].y, vertex[0].z - vertex[1].z);

        R3Vector b = new R3Vector(vertex[2].x - vertex[1].x, vertex[2].y - vertex[1].y, vertex[2].z - vertex[1].z);

        return R3Vector.multiplyVector(a, b);

    }


    public void draw(Graphics g) {
        g.setColor(new Color(0, 0, 255));
        //g.fillRect((int)vertex[0].x, (int)vertex[3].y, (int)vertex[1].x, (int)vertex[1].y);
        // int[] arrayX = {20, 100, 100, 250, 250, 20, 20, 50};
        //int[] arrayY = {180, 180, 200, 200, 220, 200, 200, 190};
        // Polygon poly = new Polygon(arrayX, arrayY, 8);
        //g.drawPolygon(poly);
        g.drawLine((int) vertex[0].x, (int) vertex[0].y, (int) vertex[1].x, (int) vertex[1].y);
        g.setColor(new Color(0, 255, 0));
        g.drawLine((int) vertex[1].x, (int) vertex[1].y, (int) vertex[2].x, (int) vertex[2].y);
        g.setColor(new Color(255, 0, 0));
        g.drawLine((int) vertex[2].x, (int) vertex[2].y, (int) vertex[3].x, (int) vertex[3].y);
        g.setColor(new Color(255, 0, 255));
        g.drawLine((int) vertex[3].x, (int) vertex[3].y, (int) vertex[0].x, (int) vertex[0].y);
    }
}