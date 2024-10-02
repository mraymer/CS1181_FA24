import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainWindow extends JFrame{

    // Inner classes
    public class ButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e){
            clicks++;
            theButton.setText("Clicks: " + clicks);
        }
    }

    // Fields
    private int clicks = 0;
    private JButton theButton;

    // Methods
    public MainWindow(String title){
        super(title);

        JPanel content = new JPanel();
        content.setLayout(new FlowLayout());
        this.setContentPane(content);


        theButton = new JButton("Clicks: 0");
        theButton.addActionListener(new ButtonListener());
        content.add(theButton);
    }
}