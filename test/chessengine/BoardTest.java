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
        Square.count = 0; //zero square counter for each test;
    }

    @Test
    public void boardCreatedReturnsNotNull() {
        Board board = new Board();
        assertNotNull("Board creation", board);
    }
    
    @Test
    public void getBoardCreates8Rows8Columns() {
        Board board = new Board();
        //rows
        int expectedrows = 8;
        int actualrows = board.getBoard().length;
        assertEquals("New Board Row Size", expectedrows, actualrows);
        //columns
        int expectedcolumns = 8;
        int actualcolumns = board.getBoard()[0].length;
        assertEquals("New Board Columns Size", expectedcolumns, actualcolumns);
    }
    
    @Test
    public void getSquareAtZeroReturnsSquareIDZero() {
        Board board = new Board();
        Square square = board.getSquareAt(0,0);
        int expected = 1;
        int actual = square.getID();
        assertEquals("Get Square Returns correct square by ID", expected, actual);
    }
    
}
