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
        theButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                clicks++;
                theButton.setText("Clicks: " + clicks);
            }
        });
        content.add(theButton);

    }
}