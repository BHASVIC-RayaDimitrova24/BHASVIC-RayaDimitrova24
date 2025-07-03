import java.util.ArrayList;
import java.util.Objects;

public class AdoptionCenter {
    ArrayList<Pet> pets = new ArrayList<>();

    //constructor for class
    AdoptionCenter(){
        ArrayList<Pet> pets = new ArrayList<>();
    }

    //adds a new pet instance to the array list
    public void addPet(Pet pet){
        pets.add(pet);
    }

    //displays the info of only the pets that are available
    public void displayAvailablePets(){
        for(int i=0; i<pets.size(); i++){
            Pet pet = pets.get(i);
            if(!pet.getIsAdopted()){
                System.out.println(pet.getName() + " is available.");
                pet.displayInfo();
            }
        }
    }

    //updates attributes to count number of adopted and available animals
    int availableCount =0;
    int adoptedCount = 0;
    public void displayStatistics(){
        for(int i=0; i<pets.size(); i++){
            Pet pet = pets.get(i);
            if(!pet.getIsAdopted()){
                availableCount = availableCount +1;
            }
            else{
                adoptedCount = adoptedCount +1;
            }
        }
        System.out.println(availableCount + " pets are available.");
        System.out.println(adoptedCount + " pets are adopted.");
    }


    //displays the info of all elements in the array
    public void displayAllPets(){
        for(int i=0; i<pets.size(); i++){
            Pet pet = pets.get(i);
            pet.displayInfo();

        }
    }

    //the user adopts the animal that they enter
    public void adoptPet(String name){
        for(int i=0; i<pets.size(); i++){
            Pet pet = pets.get(i);
            if(Objects.equals(pet.getName(), name)){
                System.out.println(name + " is now adopted.");
                pet.adopt(pet);
            }
        }
    }

    public void returnPet(String name){
        for(int i=0; i<pets.size(); i++){
            Pet pet = pets.get(i);
            if(Objects.equals(pet.getName(), name)){
                pets.remove(pet);
            }
        }
    }

    //subroutines for displaying only the pets of a certain species or age
    public void findBySpecies(String species){
        for(int i=0; i<pets.size(); i++){
            Pet pet = pets.get(i);
            if(Objects.equals(pet.getSpecies(), species)){
                pet.displayInfo();
            }
        }
    }

    public void findByAge(int age){
        for(int i=0; i<pets.size(); i++){
            Pet pet = pets.get(i);
            if(Objects.equals(pet.getAge(), age)){
                pet.displayInfo();
            }
        }
    }

    public boolean doesNameExist(String name){
        for(int i=0; i<pets.size(); i++){
            Pet pet = pets.get(i);
            if(Objects.equals(pet.getName(), name)){
                return true;
            }
        }
        return false;
    }



}