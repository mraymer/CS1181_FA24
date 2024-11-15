public class Main {
    public static void main(String[] args) {
        System.out.println("Creating and starting thread");
        Thread thread1 = new LetterCounter();
        Thread thread2 = new NumberCounter();
        thread2.start();
        thread1.start();
        try {
            thread1.join();   // Wait for thread1 to finish
            thread2.join();   // Wait for thread2 to finish
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Main is done!!");
        
    }
}
