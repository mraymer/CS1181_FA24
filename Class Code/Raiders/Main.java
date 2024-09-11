import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Raider me = new Raider("Raymer", "Mike");
        System.out.println(me);

        Student you = new Student("Raymer", "Jan", 123, 3.8);
        System.out.println(you);
        System.out.println(you.getGpa());

        Raider rowdy = new Student("Raider", "Rowdy", 999, 4.0);
        System.out.println(rowdy);

        // Typecast to force child class:  DANGEROUS!
        System.out.println(((Student) rowdy).getGpa());

        Raider president = new Employee("Edwards", "Sue", 1);
        System.out.println(president);
        //System.out.println(((Student)president).getUid());

        ArrayList<Raider> people = new ArrayList<>();
        people.add(me);
        people.add(you);
        people.add(president);

    }
}
