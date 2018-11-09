public class Cat {

    // Properties
    int happiness;
    boolean isPet = false;



    // Constructor(s)
    public Cat(int happiness) {
            this.happiness = happiness;

    }

    // Getter

    public int getHappiness() {
        return this.happiness;

    }


    // Setters

    public void setHappiness(int happiness){
        this.happiness = happiness;
    }

    // Abilities

    public void pet(){
        this.happiness = (this.happiness - 50);
        isPet = true;
    }

    public void scold(){
        this.happiness = (this.happiness - 20);
        System.out.println("woah");
    }

    public void eat(){
        System.out.println("thank for food");
    }



}