import java.awt.Color;

public class Rabbit extends AbstractActor {

    static Color color = Color.LIGHT_GRAY;

    public Rabbit(Cell cell) {
        super(cell, color);
    }

}