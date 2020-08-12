import java.awt.*;

public abstract class AbstractActor implements Actor {
    Cell cell;
    Color color;

    public AbstractActor(Cell cell, Color color) {
        this.cell = cell;
        this.color = color;
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(color);
        g.fillRect(cell.x, cell.y, cell.width, cell.height);
        g.setColor(Color.BLACK);
        g.drawRect(cell.x, cell.y, cell.width, cell.height);
    }

}