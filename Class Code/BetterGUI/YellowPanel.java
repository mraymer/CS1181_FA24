import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class YellowPanel extends JPanel{
    public YellowPanel(){
        super();
    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(Color.YELLOW);
        g.fillRect(0, 0, getWidth(), getHeight());
    }
    
}
