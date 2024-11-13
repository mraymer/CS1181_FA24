import java.awt.BorderLayout;

import javax.swing.*;


public class TriApp extends JFrame {

    public TriApp(String title){
        super(title);
        add(new FracTri());
    }

    public static void main (String[] args){
        TriApp window = new TriApp("Triangles!");
        JPanel content = new JPanel();
        content.setLayout(new BorderLayout());
        window.setContentPane(content);
        window.setSize(300, 300);
        window.setLocation(300, 300);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        content.add(new FracTri(), BorderLayout.CENTER);
        window.setVisible(true);
    }


    
}
