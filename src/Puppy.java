import java.awt.Color;

public class Puppy extends AbstractActor {

    static Color color = Color.GREEN;

    public Puppy(Cell cell) {
        super(cell, color);
    }

}