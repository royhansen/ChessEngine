package chessengine;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Roy Hansen
 */
public class SquareTest {
    
    public SquareTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
        Square.count = 0; //reset global square count between each test
    }

    @Test
    public void squareCreatedReturnsNotNull() {
        Square square = new Square();
        assertNotNull("Square object created", square);
    }
    
    @Test
    public void getSquareFirstIdReturnsOne(){
        Square square = new Square();
        int expected = 1;
        int actual = square.getID();
        assertEquals(expected, actual);       
    }
    
    @Test
    public void getSquareTwoIdReturnsTwo(){
        Square square0 = new Square();
        Square square1 = new Square();
        int expected = 2;
        int actual = square1.getID();
        assertEquals(expected, actual);       
    }
    
    @Test
    public void emptySquareHasPieceReturnsFalse() {
        Square square = new Square();
        assertFalse("New Empty Square Shouldn't Have Piece", square.hasPiece());
    }
    
    @Test
    public void hasPieceReturnsTrueIfPieceAddedOrFalseIfRemoved() {
        Square square = new Square();
        Piece p = new Piece();
        square.addPiece(p);
        assertTrue("New Empty Square Shouldn't Have Piece", square.hasPiece());
        square.removePiece(p);
        assertFalse("Piece Removed - Should return false",square.hasPiece()); 
    }
    
    @Test
    public void addPiecePawnReturnPawnType() {
        Square square = new Square();
        Piece p = new Piece();
        //PieceType actual = square.addPiece(p);
        //assertEquals("Pawn Added", PieceType.PAWN, );
    }
 
}
