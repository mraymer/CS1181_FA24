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
        content.setLayout(new FlowLayout());
        this.setContentPane(content);


        // Anonymous Inner Class for our ActionListener
        theButton = new JButton("Clicks: 0");
        theButton.addActionListener(e -> {
            clicks++;
            theButton.setText("Clicks: " + clicks);
            for (int i = 1; i <= 20; i++){
                System.out.println("Counting: " + i);
                try{
                    Thread.sleep(1000);
                }
                catch(InterruptedException ex){
                    ex.printStackTrace();
                }
            }
        });
        content.add(theButton);

    }
}