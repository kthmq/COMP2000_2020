import java.awt.*;

class Cell extends Rectangle {
    static int size = 35;

    // constructors
    public Cell(int x, int y) {
        super(x, y, size, size);
    }

    // methods
    void paint(Graphics g, Point mousePos) {
        // Check mouse highlight before fill
        g.setColor((mousePos != null) && (contains(mousePos)) ? Color.GRAY : Color.WHITE);
        g.fillRect(x, y, size, size);
        // Stroke border
        g.setColor(Color.BLACK);
        g.drawRect(x, y, size, size);
    }

}