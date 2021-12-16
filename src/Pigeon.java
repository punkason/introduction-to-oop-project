//The Pigeon extends the base class Bird
public class Pigeon extends Bird {

    //The Pigeon constructor calls the base class Bird constructor
    //The name and color parameters are passed to the Bird constructor
    public Pigeon(String name, String color) {
        super(name, color);
    }

    //add at ex4.4
    @Override
    public void speak() {
        System.out.println("Yo! I'm " + name + " and I'm a " + color + " pigeon.");
    }

    public void eatPizza() {
        System.out.println("Delicious pizza!");
    }

    //ex3 Optional Challenge
    public void Sleep () {
        System.out.println("I'm a sleeping pigeon");
    }
}