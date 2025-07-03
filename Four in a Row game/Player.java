import java.util.ArrayList;

public class Player{
    String name;    //make name be accessed from ArrayList
    int number;

    //Board myBoard = new Board( width, height);
    int x = 4;
    int y = 4;
   // Board myBoard = new Board(4,4);



    Player(String nameInput, int numberInput) {
        this.name = nameInput;
        this.number = numberInput;
        //players.add(Player);  //add player to ArrayList

    }



    public String getName(){

        return this.name;
    }

    public int getNumber(){
        return this.number;
    }


    public String checkWinner(Board board){
        int playerNumber = this.getNumber();
        if (board.checkVertical1()){
            return this.name;
        }
        else if(board.checkHorizontal1()){
            return this.name;
        }
        else if(board.checkRightDiagonal1()) {   //was (board.getCheckRightDiagonal())
            return this.name;
        }
        else if(board.checkLeftDiagonal1()) {
            return this.name;
        }
        else{
            return "Nobody";
        }

    }


    /*
    public String checkWinner(Board board){
        int playerNumber = this.getNumber();
        if (board.getCheckVertical()){
            return this.name;
        }
        else if(board.getCheckHorizontal()){
            return this.name;
        }
        else if(board.getCheckRightDiagonal()) {
            return this.name;
        }
        else if(board.getCheckLeftDiagonal()) {
            return this.name;
        }
        else{
            return "Nobody";
        }

    }*/

    /*public void makeMove(Board board){
        for (int p = 0; p < Main.getPlayerNum(); p++) {
            System.out.println("Enter row number");
            int xCoordinate = Integer.parseInt(Console.readLine());

            System.out.println("Enter column number");
            int yCoordinate = Integer.parseInt(Console.readLine());

            int [][] myBoard = board.getBoard();
            if(myBoard[xCoordinate-1][yCoordinate-1] == 0){
                myBoard[xCoordinate-1][yCoordinate-1] = 1;
                //board.display();
            }
            else{
                System.out.println("Invalid move");
            }
            board.display();
        }


    }*/

    public void makeMove1(Board board){

        System.out.println("Enter row number");
        int xCoordinate = Integer.parseInt(Console.readLine());

        System.out.println("Enter column number");
        int yCoordinate = Integer.parseInt(Console.readLine());

        int [][] myBoard = board.getBoard();
        if(myBoard[xCoordinate-1][yCoordinate-1] == 0){
            myBoard[xCoordinate-1][yCoordinate-1] = 1;
            //board.display();
        }
        else{
            System.out.println("Invalid move");
        }


    }

    public void makeMove2(Board board){

        System.out.println("Enter row number");
        int xCoordinate = Integer.parseInt(Console.readLine());

        System.out.println("Enter column number");
        int yCoordinate = Integer.parseInt(Console.readLine());

        int [][] myBoard = board.getBoard();
        if(myBoard[xCoordinate-1][yCoordinate-1] == 0){
            myBoard[xCoordinate-1][yCoordinate-1] = 2;
            //board.display();
        }
        else{
            System.out.println("Invalid move");
        }

    }

    public void makeMove3(Board board){

        System.out.println("Enter row number");
        int xCoordinate = Integer.parseInt(Console.readLine());

        System.out.println("Enter column number");
        int yCoordinate = Integer.parseInt(Console.readLine());

        int [][] myBoard = board.getBoard();
        if(myBoard[xCoordinate-1][yCoordinate-1] == 0){
            myBoard[xCoordinate-1][yCoordinate-1] = 3;
            //board.display();
        }
        else{
            System.out.println("Invalid move");
        }


    }

    public void makeMove4(Board board){

        System.out.println("Enter row number");
        int xCoordinate = Integer.parseInt(Console.readLine());

        System.out.println("Enter column number");
        int yCoordinate = Integer.parseInt(Console.readLine());

        int [][] myBoard = board.getBoard();
        if(myBoard[xCoordinate-1][yCoordinate-1] == 0){
            myBoard[xCoordinate-1][yCoordinate-1] = 4;
            //board.display();
        }
        else{
            System.out.println("Invalid move");
        }


    }

    public void makeMove5(Board board){

        System.out.println("Enter row number");
        int xCoordinate = Integer.parseInt(Console.readLine());

        System.out.println("Enter column number");
        int yCoordinate = Integer.parseInt(Console.readLine());

        int [][] myBoard = board.getBoard();
        if(myBoard[xCoordinate-1][yCoordinate-1] == 0){
            myBoard[xCoordinate-1][yCoordinate-1] = 5;
            //board.display();
        }
        else{
            System.out.println("Invalid move");
        }


    }
}