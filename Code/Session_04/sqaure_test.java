// Code to draw a Square that is being explained by Proff. (Session 04)

package Session_04;
import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Color;

public class sqaure_test {
    public static void main(String[] args){

        JFrame frame = new JFrame("Swing Square Outline"){
            @Override
            public void paint(Graphics g){
                super.paint(g);
                g.setColor(Color.ORANGE);

                g.drawRect(100, 100, 150, 150);
            }
        };

        frame.setSize(1280, 720);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
