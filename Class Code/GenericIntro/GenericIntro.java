import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.Collections;
import javax.swing.JButton;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Arrays;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

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

       List<Number> l = new ArrayList<>();
       l.add(8);
       l.add(9.2);
       l.add(-5);

       Set<Integer> s = new HashSet<>();
       s.add(5);
       s.add(3);
       s.add(5);
       s.add(2);

       l.addAll(s);
       System.out.println(l);

       LottoBag<Number> b = new LottoBag<>();
       b.add(7);
       b.add(9);
       b.add(3);

       ArrayList<Integer> newStuff = new ArrayList<>();
       newStuff.add(2);
       newStuff.add(4);
       newStuff.add(6);

       b.addAll(newStuff);
       System.out.println(b);

       Integer[] a = {2, 4, 6, 8, 10};
       printArray(a);

       System.out.println(min3(9, 21, 17));
       System.out.println(min3("Hello", "World", "Baseball"));

       Rectangle2D r = new Rectangle2D.Float(7, 3, 20, 0.01F);
       Ellipse2D e = new Ellipse2D.Float(6, 2, 2, 2);
       if (e.intersects(r)){
        System.out.println("INTERSECT");
       }

       System.out.println(r);

    }

    public static <T> void printArray(T[] stuff){
        System.out.print("[");
        for (T item : stuff){
            System.out.print(item + ", ");
        }
        System.out.println("]");
    }

    public static <T, E> E foo(T first, E second){
        return second;
    }

    public static <T extends Comparable<T>> T min3(T first, T second, T third){
        T smallest = first;
        if (second.compareTo(smallest) < 0){
            smallest = second;
        }
        if (third.compareTo(smallest) < 0){
            smallest = third;
        }

        return smallest;
    }
}

