import java.util.ArrayList;
import java.util.Arrays;

public class HelloWorld {
    public static void main(String[] args) {

        // Passing by value, i is not changed:
        int i = 7;
        printDouble(i);
        System.out.println(i);

        // Passing by reference, myList *IS* changed
        ArrayList<Integer> myList = new ArrayList<>(Arrays.asList(1, 2, 3));
        changeInts(myList);
        System.out.println("myList: " + myList);


        // Two reference variables to the same object/array:
        // Changing values also changes others, and vice versa
        int[] values = new int[5];
        for (int j = 0; j <5; j++){
        values[j] = j * 2 + 7;
        }

        int[] others = values;
        others[2] = -111;

        for (int j = 0; j < 5; j++){
        System.out.println(values[j]);
        }

        // Autoboxing
        ArrayList<Integer> someList = new ArrayList<>();
        int p = 9;

        // p is "boxed" to make an Integer
        someList.add(p);

        p = someList.get(2);


        int myInt = 7;
        double myDouble = 9.2;

        // Promotion:  we can copy an int into a double because
        // no data is lost
        myDouble = myInt;
        System.out.println(myDouble);

        // Forcing a conversion by typecasting
        myInt = (int) myDouble;
        

    }

    // Double all the values in an integer array
    public static void changeInts(ArrayList<Integer> values) {
        System.out.println("Before change: " + values);
        for (int i = 0; i < values.size(); i++) {
            values.set(i, values.get(i) * 2);
        }
        System.out.println("After change: " + values);
    }

    // Double a single value.  Since int is an intrinsic data type,
    // this won't change the value passed in
    public static void printDouble(int someValue) {
        someValue = someValue * 2;
        System.out.println(someValue);
    }
}
