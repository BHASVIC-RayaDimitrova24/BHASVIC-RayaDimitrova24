public class Reptile extends Animal {
    protected int wings;

    Reptile(String skinType, boolean tail, int legs, int arms, int wings) {
        super(skinType, tail, legs, arms);
        this.setColdBlooded(false);
        this.wings = wings;
    }

    public boolean getColdBlooded(){
        return true;
    }


}