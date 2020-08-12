import java.awt.Color;

public class Lion extends AbstractActor {

    static Color color = Color.RED;

    public Lion(Cell cell) {
        super(cell, color);
    }

}