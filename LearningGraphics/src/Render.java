import java.awt.geom.*;

class Render {
    public int x1 = 20;
    public int x2 = 100;
    public int y1 = 20;
    public int y2 = 100;

    public void paint(Graphics g) {
        Graphics2D g2 = g;
    }

    public Render(int x1, int y1, int x2, int y2) {
        g2.draw(new Line2D.Double(x1, y1, x2, y2));
    }
}