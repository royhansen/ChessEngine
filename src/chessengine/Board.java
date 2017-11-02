package chessengine;

/**
 *
 * @author Roy Hansen
 */

public class Board {
    private final Square[][] board;
    
        public Board(){
            this.board = new Square[8][8];
        }
        
        Square[][] getBoard() {
            return this.board;
        }
        
    @Override
        public String toString(){
            for (int row = 0; row < board.length; row++){
                for (int col = 0; col < board[0].length; col++){
                    System.out.print("X");
                }
                System.out.println("");
            } 
            return "test";
        }
        
        public String printBoardPositions(){
            for (int row = 0; row < board.length; row++){
                for (int col = 0; col < board[0].length; col++){
                    System.out.print(col + "," + row + " ");
                }
                System.out.println("");
            } 
            return "test";
        }
    
}
