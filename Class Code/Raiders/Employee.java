public class Employee extends Raider{
    private int uid;

    public Employee(String lastName, String firstName, int uid){
        super(lastName, firstName);
        this.uid = uid;
    }

    public int getUid(){
        System.out.println("Calling Employee getUID");
        return this.uid;
    }
}
