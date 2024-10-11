import javax.swing.*;
import java.awt.Scrollbar;

public class MainWindow extends JFrame{

    private PieChart theChart;

    public MainWindow(){
        super();
        JPanel content = new JPanel();
        content.setLayout(new BoxLayout(content, BoxLayout.Y_AXIS));
        this.setContentPane(content);
        this.theChart = new PieChart();
        content.add(theChart);
        theChart.invalidate();

        JScrollBar theBar = new JScrollBar(Scrollbar.HORIZONTAL, 50, 10, 0, 110);

        theBar.addAdjustmentListener(e -> {
            theChart.setPercent(e.getValue());
            theChart.invalidate();
            theChart.repaint();
        });
        content.add(theBar);
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
