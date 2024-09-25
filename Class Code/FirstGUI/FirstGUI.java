import javax.swing.*;
import java.awt.*;

public class FirstGUI {
    public static void main(String[] args) {

        int clicks = 0;

        JFrame window = new JFrame("First GUI");
        window.setSize(300, 300);
        window.setLocation(250, 250);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        YellowPanel content = new YellowPanel();
        // If we don't specify a layout manager, we get FlowLayout by default
        //content.setLayout(new BoxLayout(content, BoxLayout.X_AXIS));
        window.setContentPane(content);

        JButton button = new JButton("Click me");
        content.add(button);


        JButton button2 = new JButton("Click me 2");
        content.add(button2);

        for (int i = 0; i < 5; i++){
            JButton newButton = new JButton("Button " + i);
            content.add(newButton);
        }


        window.setVisible(true);



        // JFrame window2 = new JFrame("Another window");
        // window2.setSize(300, 300);
        // window2.setLocation(450, 450);
        // //window2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // window2.setVisible(true);

        for (int i = 0; i < 100000; i++){
            System.out.println(i);
        }
        System.out.println("About to exit the program...");
    }
}