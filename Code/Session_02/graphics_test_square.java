import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Graphics;

class SimpleJava2DLines extends JFrame {

    SimpleJava2DLines() {
        setTitle("The first Java 2D program");
        setSize(1000, 810);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        g.setColor(Color.BLACK);
        g.drawRect(100, 100, 250, 250);
    }

    public static void main(String[] argv) {
        new SimpleJava2DLines();
    }
}