/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.danieldev.chessmasters.pieces;

import es.danieldev.chessmasters.Board;
import es.danieldev.chessmasters.BoardSlot;
import java.util.List;

/**
 *
 * @author zebnat
 */
public class Bishop extends Piece {

	public Bishop(Color color) {
		super(color);
		codeName = Piece.CodeName.BISHOP;
	}

	@Override
	public List<BoardSlot> possibleMoves(Board b) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}
	
}