public class Human {
    
    String name;
    int age;
    int heightInInches;
    String eyeColour;

    

    public Human(String name, int age, int heightInInches, String eyeColour) {
        this.name = name;
        this.age = age;
        this.heightInInches = heightInInches;
        this.eyeColour = eyeColour;
    }

    public Human(){
        this.name="shankar";
        this.age=35;
        this.eyeColour="black";
        this.heightInInches = 90;
    }


    public void speak(){
        System.out.println("Hello ,I'm "+name);
        System.out.println("my age is "+age);
        System.out.println("I'm tall "+heightInInches+" height");
        System.out.println("My Eye color is "+eyeColour);
    }

    public void walk(){
        System.out.println("Walking...");
    }

    public void eat(){
        System.out.println("eat....");
    }

    public void work(){
        System.out.println("working...");
    }



}
