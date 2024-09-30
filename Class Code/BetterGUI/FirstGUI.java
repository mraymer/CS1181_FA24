import javax.swing.*;
import java.awt.*;

public class FirstGUI {
    public static void main(String[] args) {

        MainWindow window = new MainWindow("First GUI");
        window.setSize(300, 300);
        window.setLocation(250, 250);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);

        System.out.println("About to exit main...");
    }
}