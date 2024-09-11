public class Raider {
    private String firstName;
    private String lastName;

    public Raider(){
        this.firstName = "Unknown";
        this.lastName = "Unknown";
    }

    public Raider(String lastName, String firstName){
        this.lastName = lastName;
        this.firstName = firstName;
    }

    @Override
    public String toString(){
        return this.lastName + ", " + this.firstName;
    }
}