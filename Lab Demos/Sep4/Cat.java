public class Cat extends Animal {

    //private fur variable encapsulated in Cat
    private boolean hasFur;
    //Don't need to declare speed since we are extending Animal

    /**
     * Cat constructor
     * @param hasFur Determine if cat has fur or not.
     * @param speed pass speed into super constructor to set cat's speed
     */
    public Cat(boolean hasFur, int speed) {
        super(speed);
        this.hasFur = hasFur;
    }

    /**
     * Demo function to show using super method inside overridden method.
     * Calling walk() on a Cat object will prepend cat before using the Animal class' walk() method.
     * This may be beneficial when trying to use the private password in practice problem 1. 
     * 
     * @return String to show walking speed
     */
    @Override
    public String walk() {
        return "This animal is cat:\n" + super.walk();
    }
    

}