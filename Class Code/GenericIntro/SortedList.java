import java.util.ArrayList;
import java.util.Collections;

public class SortedList<E extends Comparable<E>> extends ArrayList<E> {
    @Override
    public boolean add(E item){
        super.add(item);
        Collections.sort(this);
        return(true);
    }    
}
