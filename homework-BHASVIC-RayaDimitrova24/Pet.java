class Pet{
    //instantiating the attributes
    private String name;
    private String species;
    private String breed;
    private int age;
    private boolean isAdopted;

    //constructor for pet class
    Pet(String name, String species, String breed, int age){
        this.name = name;
        this.breed = breed;
        this.species = species;
        this.age = age;
        isAdopted = false;
    }

    //displays attributes of an instance
    public void displayInfo(){
        System.out.println("The name is: " + this.name);
        System.out.println("The species is: " + this.species);
        System.out.println("The age is: " + this.age);
        if(isAdopted){
            System.out.println("The pet is adopted");
        }
        else{
            System.out.println("The pet is not adopted");
        }
        System.out.println("  ");
    }

    //returns true if adopted, flase if not
    public boolean getIsAdopted(){
        if(this.isAdopted){
            return true;
        }
        else{
            return false;
        }
    }

    //adopts pet instance taken in as a parameter
    public void adopt(Pet pet){
        pet.isAdopted = true;
    }

    //getters for attributes
    public String getName(){
        return this.name;
    }

    public String getSpecies(){
        return this.species;
    }

    public int getAge(){
        return this.age;
    }

}