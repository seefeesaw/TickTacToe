import java.util.Scanner;
import java.util.Arrays;
import java.util.InputMismatchException;
public class TicTacToe{

    /************************************/
    /* Main Runner Method: Do not edit. */
    public static void main(String[]args){

        // scanner for getting input
        Scanner sc = new Scanner(System.in);

        // create vars to store player input
        int row;
        int col;

        // create a new instance of a TicTacToe game
        TicTacToe game = new TicTacToe();

        // create a new blank game grid
        char[][] grid = game.initializeGrid();

        // set the game state to 'c' for 'continue'
        char gameState = 'c';

        // declare a boolean to keep track of who's turn it is
        boolean playerToggle = true;

        // main game loop
        while(true){
            // print out the current game board
            game.printGrid(grid);

            // check to see if the game is over (won or drawn)
            gameState = game.checkGameState(grid);
            if(gameState == 'w'){
                if(playerToggle){
                    System.out.println("Game over! X won!");
                }else{
                    System.out.println("Game over! O won!");
                }
                break;
            }else if(gameState == 'd'){
                System.out.println("Game over! It's a draw!");
                break;
            }
            // get the current player's desired move location (row and col)
            row = game.getRow(sc);
            col = game.getCol(sc);

            // flip to other player's turn
            playerToggle = !playerToggle;

            // try to place a token
            char[][] newGrid;
            if(playerToggle){
                newGrid = game.placeToken(grid, 'X', row, col);
            }else{
                newGrid = game.placeToken(grid, 'O', row, col);
            }
            // compare this new grid to the old grid to see if the move was legal
            if(game.sameValues(grid, newGrid)){
                System.out.println("Illegal move! Try again.");
                playerToggle = !playerToggle;
            }else{
                // if it was legal, set the current board to the new one
                for(int i=0 ; i<grid.length ; i++){
                    for(int j=0 ; j<grid.length ; j++){
                        grid[i][j] = newGrid[i][j];
                    }
                }
            }
        }
        sc.close();
    }
    /************************************/

    public int getRow(Scanner sc){
        /* Your Code Here */
    }

    public int getCol(Scanner sc){
        /* Your Code Here */
    }

    public char checkGameState(char[][] grid){
        /* Your Code Here */
    }

    public char[][] initializeGrid(){
        /* Your Code Here */
    }

    public boolean sameValues(char[][] gridA, char[][] gridB){
        /* Your Code Here */
    }

    public char[][] placeToken(char[][] grid, char token, int row, int col){
        /* Your Code Here */
    }

    public void printGrid(char[][] grid){
        /* Your Code Here */
    }
}
