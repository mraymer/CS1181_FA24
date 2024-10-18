import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class LottoBag<E> {
    private List<E> contents;
    private Random rng;

    public LottoBag() {
        contents = new ArrayList<>();
        rng = new Random();
    }

    public void add(E newValue){
        contents.add(newValue);
    }

    public E draw() throws RuntimeException {
        if (contents.size() < 1) {
            throw new RuntimeException("Draw from empty bag");
        }

        int index = rng.nextInt(contents.size());
        //E newItem = new E();
        return contents.remove(index);
    }

    public boolean isEmpty(){
        return contents.isEmpty();
    }

    public void dump(){
        contents.clear();
    }

    public void addAll(ArrayList<? extends E> newStuff){
        for(E i : newStuff){
            this.add(i);
        }
    }

    public String toString(){
        return contents.toString();
    }
    
}
