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
public class PieceTest {
    
    public PieceTest() {
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
    public void pieceCreatedReturnsNotNull() {
        Piece piece = new Piece();
        assertNotNull("Piece not created successfully", piece);
    }
    
    @Test
    public void pieceGetPlayerReturnsOne() {
        Piece piece = new Piece(1);
        int expected = 1;
        int actual = piece.getPlayer();
        assertEquals(expected, actual);
    }
}
