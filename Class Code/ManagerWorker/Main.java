import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Manager theBoss = new Manager(500);

        // Create threads
        ArrayList<Worker> allThreads = new ArrayList<>();
        for (int i = 0; i < 5; i++){
            Worker nextThread = new Worker(i, theBoss);
            //nextThread.start();
            allThreads.add(nextThread);
        }

        try {
            for (Worker nextThread : allThreads){
                nextThread.join();
            }
        } catch (Exception e){
            e.printStackTrace();
        }

        System.out.println("All threads done!");
        System.out.println(theBoss);

        Thread myThread = new Thread(() -> {
            for (int i = 0; i < 10; i++){
                System.out.println(i);
            }
        });

        myThread.start();
    }
}
