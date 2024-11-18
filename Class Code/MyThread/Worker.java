import java.util.Random;

public class Worker extends Thread{
    private int threadNumber;
    private int[] array;
    private static int nextJob = 0;

    public Worker(int threadNumber, int[] array){
        this.threadNumber = threadNumber;
        this.array = array;
    }

    @Override
    public void run(){
        System.out.println("Starting thread: " + threadNumber);
 
        while (nextJob < 100){
            int temp = nextJob;
            try {
                Thread.sleep(100);
            } catch(Exception e){
                e.printStackTrace();
            }
            array[temp]++;
            nextJob++;
        }



        System.out.println("Thread " + threadNumber + " done!");

    }
    
}
