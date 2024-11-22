public class Manager {
    private int[] work;
    private volatile int nextJobNumber = 0;
    private int workCount;
    public static final int NO_MORE_WORK = -1;

    Manager(int workCount){
        this.workCount = workCount;
        work = new int[workCount];
    }

    public int getWork(int jobNumber){
        return work[jobNumber];
    }

    public void storeResult(int location, int result){
        work[location] = result;
    }

    private void pause(int time){
        try{
            Thread.sleep(time);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    synchronized public int getNextJob(){
        int jobNumber = NO_MORE_WORK;

        if (nextJobNumber < workCount){
            jobNumber = nextJobNumber;
            pause(1);
            nextJobNumber++;
        }

        return jobNumber;
    }

    public String toString() {
        String result = "[";

        for (int i = 0; i < work.length; i++){
            result += work[i];

            if (i < work.length -1){
                result += ", ";
            }
        }

        result += "]";

        return result;
    }

}