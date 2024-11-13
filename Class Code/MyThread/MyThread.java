class MyThread extends Thread{
    public void run(){
        for (int i = 0; i < 100; i++){
            try {
                Thread.sleep(2);
            } catch (InterruptedException e)
            {   e.printStackTrace(); }
            System.out.println(i);
        }
    }
}