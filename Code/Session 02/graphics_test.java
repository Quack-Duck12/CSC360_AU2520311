import java.awt.*;
import java.awt.event.*;

class SimpleJava2DExample extends Frame {

    SimpleJava2DExample() {
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public void paint(Graphics g) {
        g.drawString("Hello world!", 30, 50);
//        Rectangle2D.Double r2d = new Rectangle2D.Double(x,y,width,height);g.drawRect
    }

    public static void main(String[] argv) {
        SimpleJava2DExample f = new SimpleJava2DExample();

        f.setTitle("The first Java 2D program");
        f.setSize(350, 80);
        f.setVisible(true);
    }
}