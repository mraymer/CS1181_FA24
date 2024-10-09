import javax.swing.*;
import java.awt.*;

public class GridBagExample{
    public GridBagExample(){
        JFrame main = new JFrame();
        JPanel content = new JPanel();
        main.setContentPane(content);
        content.setLayout(new GridBagLayout());
        GridBagConstraints constraints;

        constraints = new GridBagConstraints();
        constraints.insets = new Insets(5, 5, 5, 5);
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.anchor = GridBagConstraints.WEST;

        content.add(new JLabel("LABEL1"), constraints);


        constraints = new GridBagConstraints();
        constraints.insets = new Insets(5, 5, 5, 5);
        constraints.gridx = 1;
        constraints.gridy = 1;
        constraints.anchor = GridBagConstraints.WEST;

        content.add(new JLabel("LABEL2"), constraints);

        constraints = new GridBagConstraints();
        constraints.insets = new Insets(5, 5, 5, 5);
        constraints.gridx = 2;
        constraints.gridy = 0;
        constraints.anchor = GridBagConstraints.WEST;

        content.add(new JButton("BUTTON1"), constraints);


        main.setSize(300, 300);
        main.setLocation(250,250);
        main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        main.setVisible(true);

    }

    public static void main(String[] args) {
        new GridBagExample();
    }
}