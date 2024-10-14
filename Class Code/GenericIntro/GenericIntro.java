import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;

public class GenericIntro{
    public static void main(String[] args){
        List<JButton> myList = new ArrayList<>();
        myList.add(new JButton("Button"));
        myList.add(new JButton("Button2"));
        //myList.add("Hello");

        for(Object o : myList){
            System.out.println(((JButton) o).getText());
        }

    }
}