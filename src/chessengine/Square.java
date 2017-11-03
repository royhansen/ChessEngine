package chessengine;

/**
 *
 * @author Roy Hansen
 */
public class Square {
    public static int count = 0;
    private int ID;
    Piece piece;
    
    public Square(){
        count = count+1;
        this.ID = count;
        this.piece = null;
    }
    
    public int getID() {
        return this.ID;
    }

    public boolean hasPiece() {
        return this.piece != null;
    }

    void addPiece(Piece piece) {
        if (this.piece == null){
            this.piece = piece;
        } 
    }

    void removePiece(Piece p) {
        this.piece = null;
    }
    
}
