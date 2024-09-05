public class Animal {
    //private speed variable encapsulated in Animal.java
    private int speed;

    public Animal(int speed) {
        this.speed = speed;
    }

    /**
     * Default walk method for Animals
     * @return String Repeated message per speed
     */
    public String walk() {
        String returnstr = "";
        for (int i = 0; i < speed; i++) {
            returnstr += "Animal Walking\n";
        }
        return returnstr;
    }

}