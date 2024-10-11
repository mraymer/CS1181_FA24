import java.util.ArrayList;
import javax.swing.JButton;

public class GenericIntro{
    public static void main(String[] args){
        ArrayList myList = new ArrayList();
        myList.add(new JButton("Button"));
        myList.add("Hello");

        for(Object o : myList){
            System.out.println(((JButton) o).getText());
        }

    }
}