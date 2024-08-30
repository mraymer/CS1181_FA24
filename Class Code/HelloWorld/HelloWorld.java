import java.util.ArrayList;
import java.util.Arrays;

public class HelloWorld {
    public static void main(String[] args) {
        int i = 7;
        printDouble(i);
        System.out.println(i);

        ArrayList<Integer> myList = new ArrayList<>(Arrays.asList(1, 2, 3));
        changeInts(myList);
        System.out.println("myList: " + myList);

        // System.out.println(i);

        // int[] values = new int[5];
        // for (int j = 0; j <5; j++){
        // values[j] = j * 2 + 7;
        // }

        // int[] others = values;
        // others[2] = -111;

        // for (int j = 0; j < 5; j++){
        // System.out.println(values[j]);
        // }

        ArrayList<Integer> someList = new ArrayList<>();
        int p = 9;
        someList.add(p);


        int myInt = 7;
        double myDouble = 9.2;

        myDouble = myInt;
        System.out.println(myDouble);

        // Forcing a conversion by typecasting
        myInt = (int) myDouble;
        

    }

    public static void changeInts(ArrayList<Integer> values) {
        System.out.println("Before change: " + values);
        for (int i = 0; i < values.size(); i++) {
            values.set(i, values.get(i) * 2);
        }
        System.out.println("After change: " + values);
    }

    public static void printDouble(int someValue) {
        someValue = someValue * 2;
        System.out.println(someValue);
    }
}
