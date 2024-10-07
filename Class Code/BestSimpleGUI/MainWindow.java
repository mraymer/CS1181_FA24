import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainWindow extends JFrame{
    // Fields
    private int clicks = 0;
    private JButton theButton;

    // Methods
    public MainWindow(String title){
        super(title);

        JPanel content = new JPanel();
        content.setLayout(new GridLayout(3,3));
        this.setContentPane(content);


        // Using a lambda expression for an action listener
        theButton = new JButton("Clicks: 0");
        theButton.addActionListener(e -> {
            clicks++;
            theButton.setText("Clicks: " + clicks);

            // We don't want to do slow things like this in the EDT:
            // for (int i = 1; i <= 20; i++){
            //     System.out.println("Counting: " + i);
            //     try{
            //         Thread.sleep(1000);
            //     }
            //     catch(InterruptedException ex){
            //         ex.printStackTrace();
            //     }
            // }
        });
        content.add(theButton);

        for (int i = 0; i < 4; i++){
            JButton newButton = new JButton("Button " + i);
            content.add(newButton);
        }

        JPanel innerContent = new JPanel();
        content.add(innerContent);

        for (int i = 0; i < 2; i++){
            JButton newButton = new JButton("inButton " + i);
            innerContent.add(newButton);
        }

        for (int i = 4; i < 7; i++){
            JButton newButton = new JButton("Button " + i);
            content.add(newButton);
        }

    }
}