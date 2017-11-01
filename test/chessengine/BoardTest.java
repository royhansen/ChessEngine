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
public class BoardTest {
    
    public BoardTest() {
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
    }

    @Test
    public void boardCreatedReturnsNotNull() {
        Board board = new Board();
        assertNotNull("Board creation", board);
    }
    
     @Test
    public void getBoardArrayCreatedReturns8x8Array() {
        Board board = new Board();
        int[][] expected = new int[8][8];
        int[][] actual = board.getBoard();
        assertArrayEquals("New Board Array", expected, actual);
    }
    
}
