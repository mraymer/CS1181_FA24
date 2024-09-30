import javax.swing.*;
import java.awt.event.*;

public class MainWindow extends JFrame{

    // Inner classes
    public class ClickListener implements ActionListener{

        public void actionPerformed(ActionEvent e){
            clicks++;
            clickLabel.setText("Total clicks: " + clicks);
        }
        
    }

    // Fields
    private int clicks = 0;
    JLabel clickLabel;

    public MainWindow(String title){
        super(title);

        YellowPanel content = new YellowPanel();
        // If we don't specify a layout manager, we get FlowLayout by default
        //content.setLayout(new BoxLayout(content, BoxLayout.X_AXIS));
        this.setContentPane(content);

        JButton button = new JButton("Click me");
        content.add(button);
        ButtonListener myListener = new ButtonListener("CLICKED");
        button.addActionListener(myListener);

        JButton button2 = new JButton("Click me 2");
        content.add(button2);
        myListener = new ButtonListener("ALSO CLICKED");
        button2.addActionListener(myListener);

        ClickListener myClickListener = new ClickListener();
        for (int i = 0; i < 5; i++){
            JButton newButton = new JButton("Button " + i);
            newButton.addActionListener(myClickListener);
            content.add(newButton);            
        }

        clickLabel = new JLabel("Total clicks: " + clicks);
        content.add(clickLabel);

    }
}
