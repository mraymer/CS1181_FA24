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
        content.setLayout(new BorderLayout());
        this.setContentPane(content);

        JButton newButton = new JButton("Top");
        content.add(newButton, BorderLayout.NORTH);

        newButton = new JButton("West");
        content.add(newButton, BorderLayout.WEST);

        JPanel midContent = new JPanel();
        content.add(midContent, BorderLayout.CENTER);

        JCheckBox newCheckBox = new JCheckBox("True or false?", false);

        newCheckBox.addItemListener(e -> {
            System.out.println("Checkbox 1: " + e.getStateChange());
        });

        midContent.add(newCheckBox);

        newCheckBox = new JCheckBox("Right or wrong?", false);

        newCheckBox.addItemListener(e -> {
            System.out.println("Checkbox 2: " + e.getStateChange());
        });

        midContent.add(newCheckBox);

        ButtonGroup group1 = new ButtonGroup();
        JRadioButton nextButton = new JRadioButton("Option2 1");
        group1.add(nextButton);
        midContent.add(nextButton);

        nextButton = new JRadioButton("Option 2");
        group1.add(nextButton);
        midContent.add(nextButton);

        nextButton = new JRadioButton("Option 3");
        group1.add(nextButton);
        midContent.add(nextButton);


    }
}