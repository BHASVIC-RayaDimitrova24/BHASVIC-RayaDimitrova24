class Player{
    //declares attributes with data types
    private String name;
    private String symbol;
    private int money;
    private int numOfAnimals;
    private int position;



    //constructor takes in 2 parameters
    Player(String name, String symbol){
        this.name = name;
        this.symbol = symbol;
        this.money = 1500;
        this.numOfAnimals = 0;
        this.position = 0;
    }

    public int getPosition(){
        return this.position;
    }

    public void increasePosition(int number){
        this.position = this.position + number;
        if(this.position == 25){
            this.money = this.money + 1000;
        }
        if(this.position > 25){
            this.position = this.position-25;
            this.money = this.money + 500;
        }
    }

    //4 getters for obtaining values of attributes
    public String getName(){
        return this.name;
    }

    public String getSymbol(){
        return this.symbol;
    }

    public int getMoney(){
        return this.money;
    }

    public int getNumOfAnimals(){
        return this.numOfAnimals;
    }

    //2 setters for increasing and decreasing money attribute
    public void addMoney(int amount){
        this.money = this.money + amount;
    }

    public void subtractMoney(int amount){
        this.money = this.money - amount;
    }

    //checks if player1 has 0 or less than 0 money i.e. bankrupt
    public static void checkBankruptcy(Player player1, Player player2){
        if(player1.money <= 0){    //edit from this. to player1.
            System.out.println(player1.getName() + ", you are bankrupt. You lose the game.");
            announceWinner(player2);
        }
    }

    //announce the winner when their opponent is bankrupt
    public static void announceWinner(Player player1){                 //made it static
        System.out.println("Congratulations " + player1.getName() + "! You are the winner.");
        System.exit(0);
    }

}