import java.util.Random;
public class Cards{

    //array stores string messages to be displayed
    private static String[] cardsArray = {"You owe money to your opponent. You lose £200 and they gain £200.", "You got a fine for speeding. You lose £500.", "Your friend has asked you for some money. You lose £70.",
            "You just got robbed. You lose £100.", "You forgot your wallet on the train. You lose £300.", "You felt sick and had to pay for a doctor's appointment. You lose £400.",
            "You just paid to go on a school trip. You lose £50.", "You accidentally dropped a bank note on the ground and were unable to find it. You lose £20.", "You need to pay your University fees. You lose £1000",
            "Someone hacked your bank account and withdrew money. You lose £600.", "Your friend gave you a birthday present. You win £200.", "You got bonus pay from work. You win £500.",
            "Due to inflation, the cost of looking after animals is rising. You now pay £2 more for each animal you own.", "You received a reward at school for 100% attendance. You win £100.", "Your family gave you money for Christmas. You win £300.",
            "You sold some items you didn't need. You win £400.", "Your friend repays you money they had borrowed from you. You win £50.", "You found a bank note in your pocket which you didn't know about. You win £20.",
            "You just won the lottery. You win £1000.", "You hacked into someone's bank account and withdrew money. You win £600."};
    //array stores integer values that correspond to the values in cardsArray
    private static int [] amounts = new int[] {200, 500, 70, 100, 300, 400, 50, 20, 1000, 600, 200, 500, 70, 100, 300, 400, 50, 20, 1000, 600};

    //subroutine for drawing a card, to be called when 2 of the same dice are drawn
    public static void getCard(Player player1, Player player2) {
        int random = (int) (Math.random() * 19);  //generate a random number from 0 to 19
        System.out.println(cardsArray[random]);  //displays string message from cardsArray at index of random number
        if(random == 0){  //if the player needs to pay £200 to their opponent
            player1.subtractMoney(200);
            player2.addMoney(200);
            System.out.println(player2.getName() + ", you now have £" + player2.getMoney()); //display player2's money
        }
        else if(random == 12){ //if player has to pay £2 for every animal they own
            System.out.println(player1.getName() + ", you have " + player1.getNumOfAnimals() + " animals so you lose £" + player1.getNumOfAnimals()*2);
            player1.subtractMoney(player1.getNumOfAnimals()*2);
            player1.checkBankruptcy(player1, player2);
        }
        else if(random<=9){  //if player loses money
            player1.subtractMoney(amounts[random]);
            player1.checkBankruptcy(player1, player2);
        }
        else{  //if player wins money
            player1.addMoney(amounts[random]);
        }
        System.out.println(player1.getName() + ", you now have £" + player1.getMoney()); //display player1's money



    }


}