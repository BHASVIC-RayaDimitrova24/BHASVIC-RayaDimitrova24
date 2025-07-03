import java.util.*;


public class Main {

	public Main() {
		//creates a new instance of AdoptionCenter class
		AdoptionCenter adoptionCenter = new AdoptionCenter();

		//creates 5 new instances of pets
		Pet dog = new Pet("Alfie", "Dog", "Poodle", 10);
		Pet cat = new Pet("Tom", "Cat", "Maine Coon",3);
		Pet fish = new Pet("Amy", "Fish", "Salmon", 7);
		Pet bird = new Pet("Mike", "Bird", "Parrot", 9);
		Pet spider = new Pet("Jamie", "Spider", "Tarantula", 1);

		//assigns the instances to the arraylist of the adoptionCenter instance
		adoptionCenter.addPet(dog);
		adoptionCenter.addPet(cat);
		adoptionCenter.addPet(fish);
		adoptionCenter.addPet(bird);
		adoptionCenter.addPet(spider);

        //instantiating some variables that are used later on
		int answer;
		String name;
		String name2;
		String species;
		int age;
		String breed;
		String name3;

		//loops until player wants to exit
		do{
			//ask user what they want to do and store their response
			System.out.println("Do you want to \n1) View available pets \n2) Adopt a pet by name \n3) Add a new pet \n4) Return a pet \n5) Display all pets \n6) See how many pets are adopted and available \n7) Find pets by species or age \n8) Exit the program ");
			answer = Integer.parseInt(Console.readLine());

			if(answer == 1){
				adoptionCenter.displayAvailablePets();
			}
			else if (answer ==2){
				System.out.println("Enter the name of the pet you want to adopt: ");
				name = Console.readLine();
				//adding confirmation
				System.out.println("Are you sure you want to adopt " + name + " (y or n)");
				String decision = Console.readLine();
				if(Objects.equals(decision, "y")){
					adoptionCenter.adoptPet(name);
				}
				else if (Objects.equals(decision, "n")){
					System.out.println(name + " remains available.");
				}
				else{
					System.out.println("Invalid input, " + name + " remains available");
				}
			}
			else if(answer ==3){
				//the do while loop ensures that duplicate names cannot exist
				do {
					System.out.println("Enter name of new pet (this must be different to existing pet names): ");
					name2 = Console.readLine();
				}while(adoptionCenter.doesNameExist(name2));
				System.out.println("Enter species of new pet: ");
				species = Console.readLine();
				System.out.println("Enter breed of new pet: ");
				breed = Console.readLine();
				System.out.println("Enter age of new pet: ");
				age = Integer.parseInt(Console.readLine());
				Pet newPet = new Pet(name2, species,breed, age);
				adoptionCenter.addPet(newPet);
			}
			else if (answer ==4){
				System.out.println("Enter name of pet you want to return: ");
				name3 = Console.readLine();
				//adding confirmation
				System.out.println("Are you sure you want to return " + name3 + " (y or n)");
				String decision = Console.readLine();
				if(Objects.equals(decision, "y")){
					adoptionCenter.returnPet(name3);
				}
				else if (Objects.equals(decision, "n")){
					System.out.println(name3 + " remains adopted.");
				}
				else{
					System.out.println("Invalid input, " + name3 + " remains adopted");
				}
			}
			else if (answer ==5){
				adoptionCenter.displayAllPets();
			}
			else if(answer == 6){
				adoptionCenter.displayStatistics();
			}
			else if(answer == 7){
				System.out.println ("Would you like to search by \n1) species \n2) age ");
				int choice = Integer.parseInt(Console.readLine());
				if(choice == 1){
					System.out.println("Enter name of species:");
					String species2 = Console.readLine();
					adoptionCenter.findBySpecies(species2);

				}
				else if (choice ==2){
					System.out.println("Enter age:");
					int age2 = Integer.parseInt(Console.readLine());
					adoptionCenter.findByAge(age2);
				}
				else{
					System.out.println("Invalid input");
				}
			}
		}while(answer != 8); //the game automatically ends when the user selects option 8


	}
	public static void main(String[] args) {
		new Main();
	}
}
