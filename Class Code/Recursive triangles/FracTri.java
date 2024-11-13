import javax.swing.*;
import javax.swing.border.BevelBorder;

import java.awt.*;

public class FracTri extends JComponent {
    private static final int MIN_TRIANGLE = 5;

    public FracTri(){
        super();
    }

    @Override
    public void paintComponent(Graphics g){

        drawTriangles(g, getWidth()/2, 10, getWidth() - 10, getHeight() - 10, 10, getHeight() - 10);
    }

    public void drawTriangles(Graphics g, int x1, int y1, int x2, int y2, int x3, int y3){

        // Base case:  If minimum side length is < MIN_TRIANGLE then don't do anything
        int sideLength1 = (int) Math.sqrt(((x1 - x2) * (x1 - x2)) + ((y1 - y2) * (y1 - y2)));
        int sideLength2 = (int) Math.sqrt(((x1 - x3) * (x1 - x3)) + ((y1 - y3) * (y1 - y3)));
        int sideLength3 = (int) Math.sqrt(((x2 - x3) * (x2 - x3)) + ((y2 - y3) * (y2 - y3)));
        int minSideLength = Math.min(sideLength1, sideLength2);
        minSideLength = Math.min(minSideLength, sideLength3);

        // Recursive case:  Draw the triangle, and then make 3 or 4 recursive calls (see below)
        if (minSideLength >= MIN_TRIANGLE) {

            // Draw the triangle using drawPolygon
            int[] xPoints = {x1, x2, x3};
            int[] yPoints = {y1, y2, y3};
            g.setColor(Color.BLACK);
            g.drawPolygon(xPoints, yPoints, 3);

            // Recursively fill in the fractal triangles
            // Comment the first recursive call for Sierpinski Triangle
            // Uncomment for full fractal
            // ------------------------------------------------------------------------------------------
            //drawTriangles(g, (x1+x2)/2, (y1+y2)/2, (x1+x3)/2, (y1+y3)/2, (x2+x3)/2, (y2+y3)/2);
            drawTriangles(g, x1, y1, (x1+x2)/2, (y1+y2)/2, (x1+x3)/2, (y1+y3)/2);
            drawTriangles(g, (x1+x3)/2, (y1+y3)/2, x3, y3, (x2+x3)/2, (y2+y3)/2);
            drawTriangles(g, (x2+x3)/2, (y2+y3)/2,(x1+x2)/2, (y1+y2)/2, x2, y2);


        }
    }



}