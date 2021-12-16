public class Main {
    public static void main(String[] args) {
        //ex2, Commented by ex4
        /*Bird myBird = new Bird("Tweety", "Yellow");
        myBird.speak();
        myBird.fly();*/

        //ex3
        Pigeon pippa = new Pigeon("Pippa", "Grey");
        pippa.speak();
        pippa.fly();
        pippa.eatPizza();
        pippa.Sleep();
        //ex5.4
        pippa.spin();
        pippa.doTheCaterpillar();
        pippa.jump();

        //ex4.8
        Penguin pingu = new Penguin("Pingu", "Black & White");
        pingu.speak();
        pingu.fly();
        //ex5.4
        pingu.spin();
        pingu.doTheCaterpillar();
        pingu.jump();

        //ex4.9
        Parrot pt = new Parrot("Parrot", "white");
        pt.speak();


    }
}
