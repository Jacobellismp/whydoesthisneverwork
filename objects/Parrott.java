public class Parrott {

    // Properties
    String word;
    int times;



    // Constructor(s)
    public Parrott(String word) {
            this.word = word;

    }



    // Getter

    public String getWord() {
        return this.word;

    }

    // Setters


    public void setWord(String word){
        this.word = word;

    }

    

    // Abilities


    public void speak(){
        if (times == 3){
            System.out.println("SHKEEP" + " SHKEEP");
        } else {
            System.out.println("Zip zop zoobity bop");
            System.out.println("bop" + " SHKEEP");
            times ++;
        }
    }


}