import javax.swing.JComponent;

import java.awt.Color;
import java.awt.Graphics;

public class PieChart extends JComponent{
    private int radius = 75;
    private int percent = 50;

    public void setPercent(int percent){
        if (percent < 0){
            this.percent = 0;
        } else if (percent > 100){
            this.percent = 100;
        }
        else {
            this.percent = percent;
        }
    }

    @Override
    public void paintComponent(Graphics g){
        g.setColor(Color.BLACK);
        g.fillArc(getWidth()/2 - radius , getHeight()/2 - radius, radius * 2, radius * 2, 90, -360 * percent/100);
        System.out.println("Painted");
    }
}