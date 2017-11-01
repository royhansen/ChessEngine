/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chessengine;

/**
 *
 * @author rh41776
 */

public class Board {
    private final int[][] board;
    
        public Board(){
            this.board = new int[8][8];
        }
        
        int[][] getBoard() {
            return this.board;
        }
    
}
