public class Mammal extends Animal {
    protected int wings;


    Mammal(String skinType, boolean tail, int legs, int arms, int wings) {
        super(skinType, tail, legs, arms);
        this.wings = wings;
        this.setColdBlooded(false);
    }


    public int getWings(){
        return this.wings;
    }
}