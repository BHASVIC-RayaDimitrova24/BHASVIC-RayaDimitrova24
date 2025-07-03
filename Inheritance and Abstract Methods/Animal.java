public abstract class Animal {
    private boolean coldBlooded;
    protected String skinType;
    protected boolean tail;
    protected int legs;
    protected int arms;
    private int wings;

    Animal( String skinType, boolean tail, int legs, int arms) {
        this.skinType = skinType;
        this.tail = tail;
        this.legs = legs;
        this.arms = arms;

    }

    public String getSkinType(){
        return skinType;
    }
    public void setSkinType(String skinType2){
        this.skinType = skinType2;
    }


    public boolean getTail(){
        return tail;
    }

    public int getLegs(){
        return legs;
    }

    public int getArms(){
        return arms;
    }

    public boolean getColdBlooded(){
        return coldBlooded;
    }
    public void setColdBlooded(boolean coldBlooded2){
        coldBlooded = coldBlooded2;
    }

    public int getWings(){
        return wings;
    }


    public void move() {
        System.out.println("This animal walks and swims");
    }

    void eat() {
        System.out.println("This animal is an omnivore");
    }

    void birth() {
        System.out.println("This animal gives birth to live young");
    }

    void hibernate() {
        System.out.println("This animal hibernates");
    }

    public void getInfo(boolean m,boolean e, boolean b, boolean h) {
        System.out.println(this.getClass()+":");
        if (this.getColdBlooded())
            System.out.println("This animal is cold-blooded");
        else
            System.out.println("This animal is warm-blooded");
        if (this.getSkinType() != null)
            System.out.println("This animal is covered in " + this.getSkinType());
        if (this.getTail())
            System.out.println("This animal has a tail");
        if (this.getLegs() > 0)
            System.out.println("This animal has " + this.getLegs() + " legs");
        if (this.getArms() > 0)
            System.out.println("This animal has " + this.getArms() + " arms");
        if (this.getWings() > 0)
            System.out.println("This animal has " + this.getWings() + " wings");
        if(m){
            this.move();
        }
        if(e){
            this.eat();
        }
        if(b){
            this.birth();
        }
        if(h){
            this.hibernate();
        }

        System.out.println();
    }


}