import javax.swing.*;

public class ThreadButton extends JButton implements Runnable{
    public ThreadButton(String title){
        super(title);

        this.addActionListener(e -> {
            new Thread(this).start();
        });
    }

    public void run(){
        for (int i = 0; i < 5; i++){
            System.out.println(i);

            try{
                Thread.sleep(1000);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}