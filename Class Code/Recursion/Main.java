public class Main{
    public static void main(String[] args) {
        System.out.println(reverse("University"));
        System.out.println(palindrome("mike"));
    }

    public static void foo(int count){
        if (count > 0){
            System.out.println("FOO!: " + count--);
            foo(count);
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