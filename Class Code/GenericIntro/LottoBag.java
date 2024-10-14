import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class LottoBag {
    private List<Integer> contents;
    private Random rng;

    public LottoBag() {
        contents = new ArrayList<>();
        rng = new Random();
    }

    public void add(Integer newValue){
        contents.add(newValue);
    }
    
}
