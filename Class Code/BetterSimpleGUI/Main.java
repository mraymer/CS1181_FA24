import java.util.ArrayList;

import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {
        MainWindow window = new MainWindow("Tiny App");
        window.setSize(200, 200);
        window.setLocation(200, 200);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);

        // Anonymous Inner Class
        ArrayList<Integer> i = new ArrayList<>(){
            @Override
            public String toString(){
                return "AL: " + super.toString();
            }
        };
        i.add(9);
        System.out.println(i);
    }
    
}
