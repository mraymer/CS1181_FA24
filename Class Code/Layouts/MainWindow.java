import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Arrays;

public class MainWindow extends JFrame{
    // Fields
    private int clicks = 0;
    private JButton theButton;
    JPanel midContent;

    // Methods
    public MainWindow(String title){
        super(title);

        JPanel content = new JPanel();
        content.setLayout(new BorderLayout());
        this.setContentPane(content);



        JMenuBar menuBar = new JMenuBar();
        content.add(menuBar, BorderLayout.NORTH);

        JMenu colorMenu = new JMenu("Color");
        menuBar.add(colorMenu);

        ArrayList<String> colors = new ArrayList<>(Arrays.asList("Blue",
            "Yellow", "Red", "Green", "White"));

        // Create an actionListener for menu items
        ActionListener colorListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                String selectedColor = e.getActionCommand();
                
                switch(selectedColor){
                    case "Blue":
                        midContent.setBackground(Color.BLUE);
                        break;
                    case "Yellow":
                        midContent.setBackground(Color.YELLOW);
                        break;
                    case "Red":
                        midContent.setBackground(Color.RED);
                        break;

                }
            }
        };
        
        for (String color : colors){
            JMenuItem colorItem = new JMenuItem(color);
            colorItem.addActionListener(colorListener);
            colorMenu.add(colorItem);
        }

        JButton newButton = new JButton("West");
        content.add(newButton, BorderLayout.WEST);

        midContent = new JPanel();
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