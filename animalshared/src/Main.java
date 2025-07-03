import java.util.Scanner;

public class Main {
    public int pl1; //Stores player 1 location
    public int pl2; //Stores player 2 location
    //public String p1 = "*";
    //public String p2 = "!";
    public String[] board = new String[26]; //Creates a 1d for the board with 26 spaces with index 0-26
    public int same;//Used to store 0 or 1, 0 means not same dice and 1 means same
    public int d1;
    public int d2;


    //General game setting out and telling the players what character represents who
    public static void main(String[] args) {
        Animal[] AnimalBoard = {
                new Animal("Dog",10, 100 ),
                new Animal("Cat",5, 50 ),
                new Animal("Mouse",2, 70),
                new Animal("Bear",15, 200 ),
                new Animal("Fish",1, 10 ),
                new Animal("Lion",100, 500 ),
                new Animal("Tortoise",15, 300),
                new Animal("Bat",20, 350 ),
                new Animal("Rabbit",25, 300 ),
                new Animal("Snake",100, 1000 ),
                new Animal("Elephant",50, 80 ),
                new Animal("Hamster",1, 5 ),
                new Animal("Tiger",45, 400 ),
                new Animal("Panda",15, 200 ),
                new Animal("Squirrel",25, 350 ),
                new Animal("Mosquito",100, 500 ),
                new Animal("Pig",40, 250 ),
                new Animal("Cow",60, 550 ),
                new Animal("Chicken",20, 60 ),
                new Animal("Parrot",10, 35 ),
                new Animal("Monkey",45, 160 ),
                new Animal("Camel",65, 200 ),
                new Animal("Owl",50, 550 ),
                new Animal("Lizard",20, 250 ),
                new Animal("Kangaroo",50, 600 ),
                new Animal("Swan",10, 600 ),
        };

        Main Board = new Main();//Creates new instant of board
        Dice dice = new Dice();

        String name1;
        boolean isCharOrInt;
        do {
            isCharOrInt = false;
            System.out.println("Player 1 enter name: ");
            name1 = Console.readLine();
            for (int i = 0; i < name1.length() ; i++) {
                if (!Character.isLetter(name1.charAt(i))) {
                    isCharOrInt = true;
                }
            }
        } while ((name1.length() < 2 || name1.length() > 19 || isCharOrInt));

        String symbol1;
        do {
            System.out.println("Player 1 enter playing piece symbol(@ or *): ");
            symbol1 = Console.readLine();
        } while (!symbol1.equals("@") && !symbol1.equals("*"));

        String name2;
        boolean isCharOrInt2;
        do {
            isCharOrInt2 = false;
            System.out.println("Player 2 enter name: ");
            name2 = Console.readLine();
            for (int i = 0; i < name2.length() ; i++) {
                if (!Character.isLetter(name2.charAt(i))) {
                    isCharOrInt2 = true;
                }
            }
        } while ((name2.length() < 2 || name2.length() > 19 || isCharOrInt2) || name2.equals(name1));

        String symbol2;
        if(symbol1.equals("@")){
            System.out.println("Player 2 your playing piece symbol is *");
            symbol2 = "*";
        }
        else{
            System.out.println("Player 2 your playing piece symbol is @");
            symbol2 = "@";
        }

        Player player1 = new Player(name1, symbol1);
        Player player2 = new Player(name2, symbol2);

        //This is used to add numbers to each index/space of the board
        for(int i = 0; i < 26; ++i) {
            Board.board[i]=Integer.toString(i);

        }
        //I used this to assign the Start and Skip a go tiles and display them on the board, is this just a nice cosmetic
        Board.board[0]="Start";
        Board.board[13]="Skip a Go";



        //Displaying the board
        System.out.println("-----------------Board-----------------");

        for(int i = 0; i < 26; ++i) {

            System.out.println(Board.board[i]); //Displays each space of the board

        }



        //This loop Condition can change
        for(int i = 0; i < 5; ++i) {
            System.out.println("Starting round");
            //This just resets the values just in case there is left over values
            Board.d1 =0;
            Board.d2 =0;
            Board.same=0;
            //Start of player one round
            System.out.println("--------------------------------------------");
            System.out.println("-----------------" + player1.getName() +"-----------------");
            //This just makes it so the game is more digestible
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please Enter to roll dice");
            scanner.nextLine();

            System.out.println("Rolling....");
            Board.d1 = dice.roll();//Calling on the function in the Dice class
            System.out.println("You have rolled " + Board.d1);
            Board.d2 = dice.roll();
            System.out.println("You have rolled " + Board.d2);
            Board.same = dice.same(Board.d1, Board.d2);//Calling on the function same() in Dice class to check if the dice rolled are the same
            if(Board.same == 1) {
                System.out.println("You have rolled a double... picking card...");
                Cards.getCard(player1,player2);

            }
            int oldL = Board.pl1;

            Board.pl1 = Board.d1+Board.d2+Board.pl1;

            if(Board.pl1 > 26){
                int tempAdd = Board.pl1-26;
                Board.pl1 = tempAdd;
            }



            if(oldL> Board.pl1) {
                System.out.println("You have passed go, you are given £500 ");
                player1.addMoney(500);
            }
            else if (Board.pl1 ==0) {
                System.out.println("You have landed on start you get £1000");
                player1.addMoney(1000);
            }
            else if(Board.pl1 == 13){
                System.out.println("You have landed on skip a go, you will skip this go");
                Board.pl1 = oldL;
                player1.addMoney(0);
            }

            //clearing the board
            for(int y = 0; y < 26; ++y) {
                Board.board[y]=Integer.toString(y);

            }
            Board.board[0]="Start";
            Board.board[13]="Skip a Go";



            //placing the symbol on the board
            Board.board[Board.pl1] = player1.getSymbol();


            System.out.println("You are now on position: "+Board.pl1);
            Animal.decideAction(player1, player2, AnimalBoard[Board.pl1]);
            //This just resets the values just in case there is left over values
            Board.d1 =0;
            Board.d2 =0;
            Board.same=0;


            //--------------------------------------------------------------------------------------------//


            //Start of player two round
            System.out.println("--------------------------------------------");
            System.out.println("-----------------" +player2.getName() +"-----------------");
            //This just makes it so the game is more digestible
            System.out.println("Please Enter to roll dice");
            scanner.nextLine();

            System.out.println("Rolling....");
            Board.d1 = dice.roll();//Calling on the function in the Dice class
            System.out.println("You have rolled " + Board.d1);
            Board.d2 = dice.roll();
            System.out.println("You have rolled " + Board.d2);
            Board.same = dice.same(Board.d1, Board.d2);//Calling on the function same() in Dice class to check if the dice rolled are the same
            if(Board.same == 1) {
                System.out.println("You have rolled a double... picking card...");
                Cards.getCard(player2,player1);
            }

            oldL = Board.pl2;

            Board.pl2 = Board.d1+Board.d2+Board.pl2;
            if(Board.pl2 > 26){
                int tempAdd = Board.pl2-26;
                Board.pl2 = tempAdd;
            }

            if(oldL> Board.pl2) {
                System.out.println("You have passed go, you are given £500 ");
                //update player money
            }
            else if (Board.pl2 ==0) {
                System.out.println("You have landed on start you get £1000");
                //Update player money
            }
            else if(Board.pl2 == 13){
                System.out.println("You have landed on skip a go, you will skip a go");


            }
            System.out.println("You are now on position: "+Board.pl2);
            Animal.decideAction(player2, player1, AnimalBoard[Board.pl2]);

            //clearing the board
            for(int x = 0; x < 26; ++x) {
                Board.board[x]=Integer.toString(x);

            }
            Board.board[0]="Start";
            Board.board[13]="Skip a Go";

            //placing the symbol on the board
            Board.board[Board.pl2] = player1.getSymbol();

            System.out.println("-----------------Board-----------------");
            //Displaying the board
            for(int j = 0; j < 26; ++j) {

                System.out.println(Board.board[j]); //Displays each space of the board

            }

        }
        System.out.println("---------------------------------------");
        System.out.println("-------------Game Over-----------------");

        if(player1.getMoney()>player2.getMoney()){
            System.out.println(player1.getName()+" wins with £"+player1.getMoney());
            System.out.println(player1.getName()+" had £"+player2.getMoney());
        }
        else if(player2.getMoney()>player1.getMoney()){
            System.out.println(player2.getName()+" wins with £"+player2.getMoney());
            System.out.println(player1.getName()+" had £"+player1.getMoney());
        }
        /*
        System.out.println("Starting roll for Player one");
        Board.d1 = dice.roll();
        Board.d2 = dice.roll();
        Board.same = dice.same(Board.d1, Board.d2);
        if(Board.same == 1) {
            System.out.println("You have rolled a double... picking card...");
            //pickCard()
        }
        int oldL = Board.pl1;

        Board.pl1 = Board.d1+Board.d2+Board.pl1;

        if(oldL> Board.pl1) {
            System.out.println("You have passed go, you are given £500 ");
            //update player money
        }
        else if (Board.pl1 ==0) {
            System.out.println("You have landed on start you get £1000");
            //Update player money
        }
        else if(Board.pl1 == 13){
            System.out.println("You have landed on skip a go, you will skip a go");

        }        */



    }
}