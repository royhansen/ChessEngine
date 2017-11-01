/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chessengine;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author rh41776
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
        // TODO review the generated test code and remove the default call to fail.
        Board board = new Board();
        assertNotNull("Board creation", board);
        //fail("The test case is a prototype.");
    }
    
//    @Test
//    public void testBoardEmptyArray() {
//        // TODO review the generated test code and remove the default call to fail.
//        Board board = new Board();
//        int[][] expected = new int[8][8];
//        int[][] actual = board.getBoard();
//        assertArrayEquals("Board array not created", expected, actual);
//        //fail("The test case is a prototype.");
//    }
    
     @Test
    public void getBoardArrayCreatedReturnsArray() {
        // TODO review the generated test code and remove the default call to fail.
        Board board = new Board();
        int[][] expected = new int[8][8];
        int[][] actual = board.getBoard();
        assertArrayEquals("New Board Array", expected, actual);
        //fail("The test case is a prototype.");
    }
    
}
