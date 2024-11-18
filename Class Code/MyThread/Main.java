import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        int[] work = new int[100];

        ArrayList<Thread> threads = new ArrayList<>();

        for (int i = 0; i < 4; i++){
            Worker nextThread = new Worker(i, work);
            threads.add(nextThread);
            nextThread.start();
        }

        try{
            for (Thread t : threads){
                t.join();
            }
        } catch (Exception e){
            e.printStackTrace();
        }


        for (int i = 0; i < 100; i++){
            System.out.println(work[i]);
        }


        // System.out.println("Creating and starting thread");
        // Thread thread1 = new LetterCounter();
        // Thread thread2 = new NumberCounter();
        // thread2.start();
        // thread1.start();
        // try {
        //     thread1.join();   // Wait for thread1 to finish
        //     thread2.join();   // Wait for thread2 to finish
        // } catch (InterruptedException e){
        //     e.printStackTrace();
        // }
        // System.out.println("Main is done!!");
        
    }
}
