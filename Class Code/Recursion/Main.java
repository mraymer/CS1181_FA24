import java.util.ArrayList;
import java.util.Arrays;

public class Main{
    public static void main(String[] args) {
        System.out.println(reverse("University"));
        System.out.println(palindrome("mike"));
        ArrayList<Integer> myList = new ArrayList<>(Arrays.asList(5, 7, 12, 2));
        System.out.println(sum(myList));
        System.out.println(max(myList));
        System.out.println(permutations("mikey"));
        myList = new ArrayList<>(Arrays.asList(5, 9, -2, 12, 15, 7));
        System.out.println(rSort(myList));
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

    // Remove a character from a string
    public static String removeChar(String theString, int position) {
        return theString.substring(0, position) + theString.substring(position + 1);
    }

    public static ArrayList<String> permutations(String theString){

        ArrayList<String> results = new ArrayList<>();

        if (theString.length() == 0){
            results.add("");
        }
        else {
            for (int i = 0; i < theString.length(); i++){
                String current = theString.substring(i, i+1);
                String theRest = removeChar(theString, i);
                ArrayList<String> subPerms = permutations(theRest);
                for (String perm : subPerms){
                    results.add(current + perm);
                }
            }
        }

        return results;
    }

    public static ArrayList<Integer> rSort(ArrayList<Integer> theList){
        // Base case:
        if (theList.size() <= 1){
            return new ArrayList<Integer>(theList);
        }

        Integer first = theList.get(0);
        ArrayList<Integer> theRest = new ArrayList<>(theList);
        theRest.remove(0);
        ArrayList<Integer> result = rSort(theRest);

        int position = 0;
        while (position < result.size() && result.get(position) < first){
            position++;
        }
        result.add(position, first);
        return result;

    }
    
}