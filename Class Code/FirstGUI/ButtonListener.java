import javax.swing.*;
import java.awt.event.*;

public class ButtonListener implements ActionListener{
    private String stringToPrint;

    public ButtonListener(String stringToPrint){
        this.stringToPrint = stringToPrint;
    }

    public void actionPerformed(ActionEvent e){
        System.out.println(stringToPrint);
        System.out.println(((JButton) e.getSource()).getText());
    }
    
}
