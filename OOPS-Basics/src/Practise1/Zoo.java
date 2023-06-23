package Practise1;

public class Zoo {
    public static void main(String[] args) {
        
        Animal animal1 = new Animal(12, "M", 120);
        animal1.eat();
        animal1.sleep();
        

        Bird bird1 = new Bird();
        bird1.fly();
        bird1.eat();
        bird1.sleep();

        Fish fish1 = new Fish(2, "N", 0.5);
        fish1.swim();
        fish1.sleep();
        fish1.eat();

        
    }
}
