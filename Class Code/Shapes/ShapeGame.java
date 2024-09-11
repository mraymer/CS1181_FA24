import java.util.ArrayList;
import java.util.Collections;

public class ShapeGame {
    public static void main(String[] args) {
        Square s = new Square(3, 5, 7);
        System.out.println("The square is at: " + s.getLocation());
        System.out.println("The area of the square is: " + s.getArea());

        // Example of sort
        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(7);
        intList.add(9);
        intList.add(2);
        intList.add(-3);
        System.out.println(intList);
        Collections.sort(intList);
        System.out.println(intList);

        ArrayList<Square> squareList = new ArrayList<>();
        squareList.add(new Square());
        squareList.add(new Square(3, 3, 5));
        squareList.add(new Square(17, 24, 9));

        Collections.sort(squareList);
    }
}
