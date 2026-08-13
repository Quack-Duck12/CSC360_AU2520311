import java.awt.*;
import java.awt.event.*;

class SimpleJava2DLines extends Frame {

    SimpleJava2DLines() {
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public void paint(Graphics g) {

        g.drawRect(100, 100, 250, 250);
    }

    public static void main(String[] argv) {
        SimpleJava2DLines f = new SimpleJava2DLines();

        f.setTitle("The first Java 2D program");
        f.setSize(1000, 810);
        f.setVisible(true);
    }
}