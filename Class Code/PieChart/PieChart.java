import javax.swing.JComponent;

import java.awt.Color;
import java.awt.Graphics;

public class PieChart extends JComponent{

    @Override
    public void paintComponent(Graphics g){
        g.setColor(Color.BLACK);
        g.fillArc(10, 10, 75, 75, 0, 350);
        System.out.println("Painted");
    }
}