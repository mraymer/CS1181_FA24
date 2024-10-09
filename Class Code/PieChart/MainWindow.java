import javax.swing.*;

public class MainWindow extends JFrame{

    public MainWindow(){
        super();
        JPanel content = new JPanel();
        content.setLayout(new BoxLayout(content, BoxLayout.Y_AXIS));
        this.setContentPane(content);
        PieChart theChart = new PieChart();
        content.add(theChart);
        theChart.invalidate();
    }

    public static void main(String[] args) {
        MainWindow theWindow = new MainWindow();
        theWindow.setSize(300, 300);
        theWindow.setLocation(300, 300);
        theWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        theWindow.setVisible(true);
        theWindow.invalidate();;
        theWindow.repaint();
    }
    
}
