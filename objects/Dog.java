public class Dog {

    // Properties
    String name;
    String breed;
    int tagNumber;
    int happiness;
    boolean isPet = false;



    // Constructor(s)
    public Dog(String name, String breed, int tagNumber, int happiness) {
            this.name = name;
            this.breed = breed;
            this.tagNumber = tagNumber;
            this.happiness = happiness;

    }



    // Getter

    public String getName() {
        return this.name;

    }

    public String getBreed() {
        return this.breed;

    }

    public int getTagNumber() {
        return this.tagNumber;

    }

    public int getHappiness() {
        return this.happiness;

    }


    // Setters


    public void setName(String name){
        this.name = name;

    }

    public void setBreed(String breed){
        this.breed = breed;

    }

    public void setTagNumber(int tagNumber){
        this.tagNumber = tagNumber;

    }

    public void setHappiness(int happiness){
        this.happiness = happiness;
    }

    // Abilities

    public String bark(){
        return("woof");
    }

    public String sayHi(){
        return(bark() + " my name is " + this.name);
    }

    public void pet(){
        this.happiness = (this.happiness + 10);
        isPet = true;
    }

    public void scold(){
        this.happiness = (this.happiness - 20);
        System.out.println("oh ok am sad");
    }

    public void eat(){
        if(this.happiness < 25){
            System.out.println("no thanks");
        } else {
            System.out.println("yes thanks");
        }
    }



}