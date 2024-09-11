public class Student extends Raider{
    private int uid;
    private double gpa;


    public Student (String lastName, String firstName, int uid, double gpa){
        super(lastName, firstName);

        // This is not good:
        // Use setters and getters to check for good data first!
        this.uid = uid;
        this.gpa = gpa;
    }

    @Override
    public String toString () {
        return super.toString() + " (" + this.uid + ")";
    }

    public double getGpa(){
        return this.gpa;
    }

    public int getUid(){
        System.out.println("Calling Student GetUID");
        return this.uid;
    }
}
