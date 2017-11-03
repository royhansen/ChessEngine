package chessengine;

/**
 *
 * @author Roy Hansen
 */

public class Board {
    private final Square[][] board;
    
        public Board(){
            this.board = new Square[8][8];
            //TODO: Offload into own method later and add squares of different colors
            for (int row = 0; row < board.length; row++){
                for (int col = 0; col < board[0].length; col++){
                    board[row][col] = new Square();
                }
            } 
           
            
        }
        
        Square[][] getBoard() {
            return this.board;
        }
        
        @Override
        public String toString(){
            String str = "";
            for (int row = 0; row < board.length; row++){
                for (int col = 0; col < board[0].length; col++){
                    if (board[row][col].hasPiece()){
                        str += "P";
                    } else {
                        str += "X"; 
                    }
                }
                str += "\n";
            } 
            return str;
        }
        
        public void printBoardPositions(){
            for (int row = 0; row < board.length; row++){
                for (int col = 0; col < board[0].length; col++){
                    System.out.print(col + "," + row + " ");
                }
                System.out.println("");
            } 
        }
        
        public Square getSquareAt(int row, int col) {
            return board[row][col];
    }
    
}
