public class Main {
    public static void main(String[] args) {
        System.out.println("Creating and starting thread");
        MyThread thread1 = new MyThread();
        thread1.start();
        for (int i = 0; i < 100; i++){
            System.out.println("MAIN: " + i);
        }
    }
}
