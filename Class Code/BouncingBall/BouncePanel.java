import javax.swing.*;
import java.awt.*;

/**
 * Class BouncePanel - A panel with a bouncing circle inside
 * @author Michael Raymer
 */
public class BouncePanel extends JPanel {
    private int circleSize;                         // Radius of the bouncing circle
    private int circleX;                            // X coordinate of the circle (see java.awt.Graphics.drawOval)
    private int circleY;                            // Y coordinate of the circle (see java.awt.Graphics.drawOval)
    private int deltaX;                             // Current x direction/speed
    private int deltaY;                             // Current y direction/speed
    private static final int sleepTime = 1;        // Pause between frame updates

    // Most of this should be passed as parameters and specified when
    // the pane is created!
    public BouncePanel(){
        super();
        circleSize = 100;
        circleX = 250;
        circleY = 250;
        deltaX = 5;
        deltaY = 2;
    }

    // Override paintComponent - called when window needs re-drawn
    public void paintComponent(Graphics g){
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, getWidth(), getHeight());
        g.setColor(Color.BLACK);

        // Note that the x and y coordinates are the upper left corner of the rectangular
        // bounding box of the circle.  See the documentation for java.awt.Graphics.drawOval()
        // for details.
        g.drawOval(circleX, circleY, circleSize, circleSize);
    }

    // We need a thread to update the circle.  Can't do it on redraw or it will only
    // happen when the window is moved, etc.
    public void animate(){
        
        // Simple collision detection
        while(true) {

            // Move the circle
            circleX += deltaX;
            circleY += deltaY;

            // Check if it hit the left side.  If so, reverse the x direction.
            // Since we are updating several pixels at a time, the circle could extend
            // beyond the left side (i.e. circleX could be negative).  If so, set it
            // to zero.
            if (circleX <= 0){
                circleX = 0;
                deltaX *= -1;
            }

            // Now check if the circle hit the top and fix as above
            if (circleY <= 0){
                circleY = 0;
                deltaY *= -1;
            }

            // Right side collision check.
            // Again, we might extend beyond the panel width.  If so,
            // fix it by moving the circle so that it is flush against the
            // right side of the panel.
            if ((circleX + circleSize) >= getWidth()){
                circleX = getWidth() - circleSize;
                deltaX *= -1;
            }

            // Bottom collision check.  Same procedure as above.
            if ((circleY + circleSize) >= getHeight()){
                circleY = getHeight() - circleSize;
                deltaY *= -1;
            }

            // Repaint the panel, and then pause for a bit
            // to keep the animation slow enough
            invalidate();
            repaint();
            try {
                Thread.sleep(sleepTime);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }    
}
