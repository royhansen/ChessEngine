package chessengine;

/**
 *
 * @author Roy Hansen
 */
public class Chessengine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Board board = new Board();
        System.out.println(board);
        board.printBoardPositions();
      
        Square s = board.getBoard()[0][0];
        s.addPiece(new Piece());
        System.out.println(board);
        
        
       
    }
    
}
