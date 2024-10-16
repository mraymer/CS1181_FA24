import java.util.ArrayList;

public class UniqueList<E> {
    private ArrayList<E> contents = new ArrayList<>();

    public void add(E item){
        if (contents.contains(item)){
            return;
        }
        else {
            contents.add(item);
        }

    }
    
    public E getFirst(){
        return contents.remove(0);
    }

    public boolean isEmpty(){
        return contents.isEmpty();
    }

    public String toString(){
        return contents.toString();
    }
}
