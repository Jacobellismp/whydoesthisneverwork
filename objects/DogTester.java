public class DogTester {


    public static void main(String[] args) {
        
        Dog rover = new Dog("Rover", "Dalmation", 1, 0);
        Dog dog2 = new Dog("oof", "mutt", 2, 0); 
        Cat cat1 = new Cat(0);
        Parrott parrott1 = new Parrott("bop");
    
        System.out.println(rover.getName());
        System.out.println(rover.getBreed());
        System.out.println(rover.getTagNumber());
        System.out.println(dog2.getHappiness());
        System.out.println(rover.sayHi());
        dog2.pet();
        System.out.println(dog2.getHappiness());
        dog2.pet();
        dog2.pet();
        dog2.pet();
        dog2.eat();
        dog2.scold();
        dog2.eat();
        cat1.eat();
        System.out.println(cat1.getHappiness());
        cat1.pet();
        System.out.println(cat1.getHappiness());
        parrott1.speak();
        parrott1.speak();
        parrott1.speak();
        parrott1.speak();
        
    }

    


}