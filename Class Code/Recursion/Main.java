import java.util.ArrayList;
import java.util.Arrays;

public class Main{
    public static void main(String[] args) {
        System.out.println(reverse("University"));
        System.out.println(palindrome("mike"));
        ArrayList<Integer> myList = new ArrayList<>(Arrays.asList(5, 7, 12, 2));
        System.out.println(sum(myList));
        System.out.println(max(myList));
    }

    public static void foo(int count){
        if (count > 0){
            System.out.println("FOO!: " + count--);
            foo(count);
        }
    }

    public static int sum(ArrayList<Integer> theList){
        ArrayList<Integer> listCopy = new ArrayList<>(theList);
        if (listCopy.size() == 0){
            return 0;
        } else {
            return listCopy.remove(0) + sum(listCopy);
        }

    }

    // Fix this to use a copy as well, so we don't break our list,
    // when we get the max!
    public static int max(ArrayList<Integer> theList){
        if (theList.size() == 1){
            return theList.get(0);
        } else
        {
            int first = theList.remove(0);
            int maxOfTheRest = max(theList);
            if (first > maxOfTheRest){
                return first;
            } else {
                return maxOfTheRest;
            }
        }
    }
    
    public static String reverse(String theString){
        if (theString.length() == 0){
            return theString;
        }
        else {
            String firstChar = theString.substring(0,1);
            String theRest = theString.substring(1);
            return reverse(theRest) + firstChar;
        }
    }

    public static String palindrome(String theString){
        if (theString.length() < 2){
            return theString;
        }
        else {
            String firstChar = theString.substring(0,1);
            String theRest = theString.substring(1);
            return firstChar + palindrome(theRest) + firstChar;
        }        

    }
}