import javax.swing.*;
import java.awt.*;

public class FirstGUI {
    public static void main(String[] args) {
        JFrame window = new JFrame("First GUI");
        window.setSize(300, 300);
        window.setLocation(250, 250);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    }
}