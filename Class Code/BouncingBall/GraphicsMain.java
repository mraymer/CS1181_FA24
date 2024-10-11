import java.awt.*;
import javax.swing.*;

public class GraphicsMain{
    public static void main(String args[]){
        JFrame frame = new JFrame("Circles");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(new GridLayout(1, 1));

        BouncePanel panel = new BouncePanel();
        frame.add(panel);
        frame.setVisible(true);

        panel.animate();
        System.out.println("Done");
    }
}