public class Worker extends Thread{
    int threadNumber;
    Manager myManager;
    private static final int WORK_TIME = 100;

    public Worker(int number, Manager myManager){
        threadNumber = number;
        this.myManager = myManager;
    }

    @Override
    public void run(){

        System.out.println("Starting thread " + threadNumber);

        int job = myManager.getNextJob();

        while (job != Manager.NO_MORE_WORK){
            int currentValue = myManager.getWork(job);
            int result = doWork(currentValue);
            myManager.storeResult(job, result);
            job = myManager.getNextJob();
        }

        System.out.println("Thread " + threadNumber + " finished");
    }

    // FAKE WORK
    private int doWork(int value){
        pause(WORK_TIME);
        return(value + 1);
    }

    private void pause(int time){
        try{
            Thread.sleep(time);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
    
}
