public class Parrot extends Bird{
    public Parrot(String name, String color) {
        super(name, color);
    }

    @Override
    public void speak() {
        System.out.println("I'm parrot.");
    }
}
