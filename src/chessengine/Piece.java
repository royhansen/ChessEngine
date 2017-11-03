package chessengine;

/**
 *
 * @author Roy Hansen
 */
class Piece {

    private int player;
    private PieceType pt;
    

    Piece(int player, PieceType pt) {
        this.player = player;
        this.pt = pt;
    }

    Piece() {
         this(1, PieceType.PAWN); //default constructor creates a pawn for player 1.
    }

    int getPlayer() {
        return this.player;
    }

    PieceType getType() {
        return this.pt;
    }
    
}
