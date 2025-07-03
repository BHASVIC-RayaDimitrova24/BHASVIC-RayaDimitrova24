class Animal{
    //private attributes as the class is encapsulated
    private String name;
    private int level;
    private int costToStop;
    private int costToBuy;
    private Player owner;

    //constructor with 3 parameters, initialises level as 0 and no owner
    Animal(String name, int costToStop, int costToBuy){
        this.name = name;
        this.level = 0;
        this.costToStop = costToStop;
        this.costToBuy = costToBuy;
        this.owner = null;
    }

    //public getters for the private attributes
    public String getAnimalName(){
        return this.name;
    }
    public int getLevel(){
        return this.level;
    }
    public String getCostToStop(){
        return this.name;
    }
    public int getCostToBuy(){
        return this.costToBuy;
    }
    public Player getOwner(){
        return this.owner;
    }

    //when player lands on unowned space
    static public void purchaseAnimal(Player player1, Animal animal1){
        if(animal1.owner == null) { //can only purchase if animal unowned
            System.out.println(player1.getName() + ", the animal " + animal1.name + " would cost £" + animal1.costToBuy + " to buy.");
            if (player1.getMoney() <= animal1.getCostToBuy()) { //not allow player to become bankrupt
                System.out.println(player1.getName() + " you only have £" + player1.getMoney() + ", so you wouldn't be able to purchase it");
            } else {
                System.out.println(player1.getName() + ", you have £" + player1.getMoney());
                System.out.println(player1.getName() + " would you like to purchase it (y or n)?: ");
                String answer = Console.readLine();
                if (answer.equals("y")) { //player only purchases it if the want to
                    player1.subtractMoney(animal1.getCostToBuy());
                    System.out.println(player1.getName() + ", your successfully purchased " + animal1.name + ", you how have £" + player1.getMoney());
                    animal1.owner = player1;
                } else {
                    System.out.println(animal1.name + " remains unowned.");

                }

            }
        }
    }

    //subroutine to increment current level of animal
    static public void upgradeAnimal(Player player1, Animal animal1){
        //animal1.owner = player1;
        if(animal1.owner == player1) { //only if the player is the owner
            if (animal1.getLevel() == 3) { //can't upgrade if on level 3
                System.out.println(animal1.name + " is already upgraded to max Level 3.");
            } else if (player1.getMoney() <= animal1.costToBuy) { //can't upgrade if it would lead to bankruptcy
                System.out.println(player1.getName() + " the animal " + animal1.name + " would cost £" + animal1.costToBuy + " to upgrade");
                System.out.println(player1.getName() + ", you only have £" + player1.getMoney() + ", so you wouldn't be able to upgrade it");
            } else {
                System.out.println(player1.getName() + " the animal " + animal1.name + " would cost £" + animal1.costToBuy + " to upgrade to level " + (int)(animal1.level + 1));
                System.out.println(player1.getName() + ", you have £" + player1.getMoney() + " would you like to upgrade it (y or n)?: ");
                String answer = Console.readLine();
                if (answer.equals("y")) { //can't upgrade unless they say they want to
                    player1.subtractMoney(animal1.costToBuy);
                    animal1.level = animal1.level + 1;
                    System.out.println(player1.getName() + ", your successfully upgraded " + animal1.name + " to level " + animal1.level + ", you how have £" + player1.getMoney());
                    animal1.costToStop = animal1.costToStop * 2;
                }
                else { //level remain the same if player refuses to upgrade
                System.out.println(animal1.name + "remains on level "+ animal1.level);
                }

            }
        }
    }

    //when player lands on a position owned by their opponent
    static public void stopCostNotification(Player player1, Player player2, Animal animal1){
        System.out.println(player1.getName() +", " + animal1.name + " is owned by "+ player2.getName()+". You own them £"+ animal1.costToStop);
        player1.subtractMoney(animal1.costToStop); //player1 gives player2 the money
        player2.addMoney(animal1.costToStop); //player 2 receives the money
        Player.checkBankruptcy(player1, player2);  //player1 has the possibility to be bankrupt
        System.out.println(player1.getName() + " you how have £"+ player1.getMoney());
        System.out.println(player2.getName() + " you how have £"+ player2.getMoney());
    }

    static public void decideAction(Player player1, Player player2, Animal animal1){
        if(animal1.owner == null) { //can only purchase if animal unowned
            purchaseAnimal(player1, animal1);
        }
        else if(animal1.owner == player1) { //only if the player is the owner
            upgradeAnimal(player1, animal1);
        }
        else {
            stopCostNotification(player1, player2, animal1);
        }


    }


}