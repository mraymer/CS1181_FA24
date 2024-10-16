import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import javax.swing.JButton;
import java.util.Comparator;
import java.util.Arrays;

public class GenericIntro{
    public static void main(String[] args){

        LottoBag<String> bag = new LottoBag<>();
        for (int i = 0; i < 10; i++){
            bag.add(Double.valueOf(i).toString());
        }

        bag.add("Hello");
        bag.add("World");

        while(!bag.isEmpty()){
            System.out.println(bag.draw());
        }

        // ArrayList<String> blist = new ArrayList<>();
        // Collections.sort(blist);

        System.out.println("Done");

        SortedList<Integer> sList = new SortedList<>();
        sList.add(9);
        sList.add(3);
        sList.add(-1);
        sList.add(2);
        System.out.println(sList);

        UniqueList<Integer> uList = new UniqueList<>();
        uList.add(7);
        uList.add(3);
        uList.add(7);
        uList.add(2);
        uList.add(3);
        System.out.println(uList);

        UniqueList<String> usList = new UniqueList<>();
        usList.add("Hello");
        usList.add("World");
        usList.add("Hello");
        System.out.println(usList);


        // This won't work:
        //SortedList<JButton> sbList = new SortedList<>();


        // List<JButton> myList = new ArrayList<>();
        // myList.add(new JButton("Button"));
        // myList.add(new JButton("Button2"));
        // myList.add("Hello");

        // for(Object o : myList){
        //     System.out.println(((JButton) o).getText());
        // }

        Comparator<Integer> myComparator = new Comparator<Integer>(){
            @Override
            public int compare(Integer first, Integer second){
                return 0;
            }
        };

        ArrayList<Integer> l = new ArrayList<>(Arrays.asList(4, 7, 9, 2, 1));
        Collections.sort(l, (first, second) -> {return 0;});
        System.out.println(l);

    }
}