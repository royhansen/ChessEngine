package chessengine;

/**
 *
 * @author Roy Hansen
 */
class Piece {

    private int player;

    Piece(int player) {
        this.player = player;
    }

    Piece() {
         this(1);
    }

    int getPlayer() {
        return this.player;
    }
    
}
