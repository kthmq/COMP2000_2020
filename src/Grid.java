import java.awt.*;
import java.util.Random;

class Grid {
    // fields
    Cell[][] cells = new Cell[20][20];

    // constructor
    public Grid() {
        for (int i = 0; i < cells.length; i++) {
            for (int j = 0; j < cells[i].length; j++) {
                cells[i][j] = new Cell(10 + 35 * i, 10 + 35 * j);
            }
        }
    }

    // methods
    public void paint(Graphics g, Point mousePos) {
        for (int i = 0; i < cells.length; i++) {
            for (int j = 0; j < cells[i].length; j++) {
                cells[i][j].paint(g, mousePos);
            }
        }
    }

    /**
     * Get a random cell within the grid
     * 
     * @return Cell : reference to the random cell
     */
    public Cell getRandomCell() {
        Random random = new Random();
        return cells[random.nextInt(20)][random.nextInt(20)];
    }

}