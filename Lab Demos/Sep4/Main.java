public class Main {
    
    public static void main(String[] args) {
        Animal lizard = new Animal(1);
        Cat dog = new Cat(true,4);
        
        System.out.println(lizard.walk());
        System.out.println(dog.walk());
    }
}
