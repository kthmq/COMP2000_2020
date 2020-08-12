
import java.awt.*;

public class Stage {

    Grid grid;
    Actor rabbit, puppy, lion;

    public Stage() {
        grid = new Grid();
        rabbit = new Rabbit(grid.getRandomCell());
        lion = new Lion(grid.getRandomCell());
        puppy = new Puppy(grid.getRandomCell());
    }

    public void paint(Graphics g, Point mousePos) {
        grid.paint(g, mousePos);
        // paint actors
        rabbit.paint(g);
        lion.paint(g);
        puppy.paint(g);
    }
}