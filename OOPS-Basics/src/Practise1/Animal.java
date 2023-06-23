package Practise1;

public class Animal {

    int age;
    String gender;
    double weightInKg;

    

    public Animal(int age, String gender, double weightInKg) {
        this.age = age;
        this.gender = gender;
        this.weightInKg = weightInKg;
    }

    public void eat(){
        System.out.println("eating..");
    }

    public void sleep(){
        System.out.println("Sleeping");
    }
    
}
