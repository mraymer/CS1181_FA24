import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame window = new JFrame("Counter");
        JPanel content = new JPanel();
        window.setContentPane(content);
        content.add(new ThreadButton("Count!"));
        window.setSize(300, 300);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    }
}
