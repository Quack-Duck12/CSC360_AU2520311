/* 
    A single program file to implement the step by step procedure 
    of drawing a Sqaure as discussed in Session 03
*/

import java.util.Scanner;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Graphics;

class Vector2 {
    int x;
    int y;

    Vector2(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class SimpleJava2DLines extends JFrame {

    Vector2 TopLeft;
    Vector2 TopRight;
    Vector2 BottomLeft;
    Vector2 BottomRight;

    SimpleJava2DLines(Vector2 TopLeft, Vector2 TopRight, Vector2 BottomLeft, Vector2 BottomRight) {
        this.TopLeft = TopLeft;
        this.TopRight = TopRight;
        this.BottomLeft = BottomLeft;
        this.BottomRight = BottomRight;

        setTitle("Java 2D Square Algorithm");
        setSize(960, 540);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        g.setColor(Color.BLACK);

        g.drawLine(TopLeft.x, TopLeft.y, TopRight.x, TopRight.y);
        g.drawLine(TopLeft.x, TopLeft.y, BottomLeft.x, BottomLeft.y);
        g.drawLine(BottomRight.x, BottomRight.y, TopRight.x, TopRight.y);
        g.drawLine(BottomRight.x, BottomRight.y, BottomLeft.x, BottomLeft.y);
    }
}

class square_algorithm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter topLeft xPos: ");
        int Xpos = scanner.nextInt();
        System.out.print("Enter topLeft YPos: ");
        int Ypos = scanner.nextInt();

        System.out.print("Enter Side Length: ");
        int length = scanner.nextInt();

        Vector2 TopLeft = new Vector2(Xpos, Ypos);
        Vector2 TopRight = new Vector2(Xpos + length, Ypos);
        Vector2 BottomLeft = new Vector2(Xpos, Ypos + length);
        Vector2 BottomRight = new Vector2(Xpos + length, Ypos + length);

        new SimpleJava2DLines(TopLeft, TopRight, BottomLeft, BottomRight);
    }
}