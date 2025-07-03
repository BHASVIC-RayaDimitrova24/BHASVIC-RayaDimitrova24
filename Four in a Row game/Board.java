import java.util.ArrayList;

public class Board {
    private int rows;
    private int columns;
    //public static int[][] board;    //needs to get board from Main
    private boolean checkVerticalTrue = false;
    private boolean checkHorizontalTrue = false;
    private boolean checkRightDiagonalTrue = false;
    private boolean checkLeftDiagonalTrue = false;
    //int [][] board;
    private int[][] board;


    Board(int width, int height) {
        //board = new int[height][width];
        //ArrayList<Board> board = new ArrayList<>();
        //int [][] board = new int[height][width];
       // public static int[][] board = int [rows][columns];
        this.rows = height;
        this.columns = width;
        this.board = new int[rows][columns];
        for (int c = 0; c < columns; c++) {
            for (int r = 0; r < rows - 3; r++) {
                board[r][c] = 0;
            }
        }
    }

    public int [][] getBoard(){
        return this.board;
    }



	public void display() {
        for (int i = 0; i < rows; i++) {

            for (int x = 0; x < columns; x++)
                System.out.print("|" + board[i][x]);
            System.out.println("|");
        }
        System.out.println();
	}
	
    private int checkVertical() {
        for (int c = 0; c < columns; c++)
            for (int r = 0; r < rows - 3; r++)
                if (board[r][c] != 0 && board[r][c] == board[r+1][c] && board[r+1][c] ==
				board[r+2][c] && board[r+2][c] == board[r+3][c])
                    return board[r][c];
                    checkVerticalTrue = true;
        return 0;
    }

    public boolean checkVertical1() {
        for (int c = 0; c < columns; c++) {
            for (int r = 0; r < rows - 3; r++) {
                if (board[r][c] != 0 && board[r][c] == board[r + 1][c] && board[r + 1][c] ==
                        board[r + 2][c] && board[r + 2][c] == board[r + 3][c])
                    return true;
            }
        }

        return false;
    }

    public boolean getCheckVertical() {
        if (checkVerticalTrue) {
            return true;
        } else {
            return false;
        }
    }

    private int checkHorizontal() {
    	for (int r = 0; r < rows; r++)
            for (int c = 0; c < columns - 3; c++)
                if (board[r][c] != 0 && board[r][c] == board[r][c+1] && board[r][c+1] ==
				board[r][c+2] && board[r][c+2] == board[r][c+3])
                    return board[r][c];
                    checkHorizontalTrue = true;
        return 0;
    }

    public boolean checkHorizontal1() {
        for (int r = 0; r < rows; r++)
            for (int c = 0; c < columns - 3; c++)
                if (board[r][c] != 0 && board[r][c] == board[r][c+1] && board[r][c+1] ==
                        board[r][c+2] && board[r][c+2] == board[r][c+3])
                    return true;

        return false;
    }

    public boolean getCheckHorizontal() {
        if (checkHorizontalTrue) {
            return true;
        } else {
            return false;
        }
    }
    
    private int checkRightDiagonal() {
        for (int r = 0; r < rows - 3; r++)
        	for (int c = 0; c <columns - 3; c++)
                if (board[r][c] != 0 && board[r][c] == board[r+1][c+1] && board[r+1][c+1] ==
				board[r+2][c+2] && board[r+2][c+2] == board[r+3][c+3])
                    return board[r][c];
                    checkRightDiagonalTrue = true;
        return 0;
    }

    public boolean checkRightDiagonal1() {
        for (int r = 0; r < rows - 3; r++)
            for (int c = 0; c <columns - 3; c++)
                if (board[r][c] != 0 && board[r][c] == board[r+1][c+1] && board[r+1][c+1] ==
                        board[r+2][c+2] && board[r+2][c+2] == board[r+3][c+3])
                    return true;

        return false;
    }

    public boolean getCheckRightDiagonal(){
        if(checkRightDiagonalTrue){
            return true;
        }
        else{
            return false;
        }
    }

    private int checkLeftDiagonal() {
        for (int r = 0; r < rows - 3; r++)
        	for (int c = 0; c < columns - 3; c++)
                if (board[r][(columns - 1) - c] != 0 && board[r][(columns - 1) - c] ==
				board[r+1][(columns - 2) - c] && board[r+1][(columns - 2) - c] ==
				board[r+2][(columns - 3) - c] && board[r+2][(columns - 3) - c] ==
				board[r+3][(columns - 4) - c])
                    return board[r][(columns - 1) - c];
                    checkLeftDiagonalTrue = true;
        return 0;
    }

    public boolean checkLeftDiagonal1() {
        for (int r = 0; r < rows - 3; r++)
            for (int c = 0; c < columns - 3; c++)
                if (board[r][(columns - 1) - c] != 0 && board[r][(columns - 1) - c] ==
                        board[r+1][(columns - 2) - c] && board[r+1][(columns - 2) - c] ==
                        board[r+2][(columns - 3) - c] && board[r+2][(columns - 3) - c] ==
                        board[r+3][(columns - 4) - c])
                    return true;

        return false;
    }

    public boolean getCheckLeftDiagonal(){
        if(checkLeftDiagonalTrue){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean boardFull(){
        int count = 0;
        for (int r = 0; r < rows; r++) {   //was-1
            for (int c = 0; c < columns; c++) {
                if (board[r][c] == 0) {
                    count = count + 1;
                }
            }
        }
        if (count == 0){
            return true;
        }
        else{
            return false;
        }
    }


}