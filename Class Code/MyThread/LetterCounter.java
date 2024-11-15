public class LetterCounter extends Thread{
    @Override
    public void run(){
        for(char c = 'a'; c <= 'z'; c++){
            System.out.println(c);
        }
    }
    
}
