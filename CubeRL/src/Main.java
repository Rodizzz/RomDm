import java.io.File;
public class Main {

    public static void main(String[] args) {

        Cube cube = new Cube();

        cube.mulNum(200);



        cube.rotate(78, 30, 147);

        CubeWin win = new CubeWin(cube);
        Sound kek = new Sound(new File("./Sounds/Кубик.wav"));

        kek.play();



    }

}