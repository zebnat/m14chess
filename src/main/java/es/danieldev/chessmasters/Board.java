/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.danieldev.chessmasters;

import es.danieldev.chessmasters.pieces.Bishop;
import es.danieldev.chessmasters.pieces.King;
import es.danieldev.chessmasters.pieces.Knight;
import es.danieldev.chessmasters.pieces.Pawn;
import es.danieldev.chessmasters.pieces.Piece;
import es.danieldev.chessmasters.pieces.Queen;
import es.danieldev.chessmasters.pieces.Rook;

/**
 *
 * @author zebnat
 */
public class Board {
	Piece[][] pieces = new Piece[8][8];

	public Board() {
		createBoard();
	}

	private void createBoard() {
		// create black mix pieces
		putPiece(new Rook(Piece.Color.BLACK), new BoardSlot(0, 0));
		//putPiece(new Knight(Piece.Color.BLACK), new BoardSlot(0, 1));
		putPiece(new Knight(Piece.Color.BLACK), new BoardSlot(2, 2));
		putPiece(new Bishop(Piece.Color.BLACK), new BoardSlot(0, 2));
		putPiece(new King(Piece.Color.BLACK), new BoardSlot(0, 3));
		putPiece(new Queen(Piece.Color.BLACK), new BoardSlot(0, 4));
		putPiece(new Bishop(Piece.Color.BLACK), new BoardSlot(0, 5));
		putPiece(new Knight(Piece.Color.BLACK), new BoardSlot(0, 6));
		putPiece(new Rook(Piece.Color.BLACK), new BoardSlot(0, 7));

		createBlackPawns();

		createWhitePawns();

		// create white mix pieces
		putPiece(new Rook(Piece.Color.WHITE), new BoardSlot(7, 0));
		putPiece(new Knight(Piece.Color.WHITE), new BoardSlot(7, 1));
		putPiece(new Bishop(Piece.Color.WHITE), new BoardSlot(7, 2));
		putPiece(new King(Piece.Color.WHITE), new BoardSlot(7, 3));
		putPiece(new Queen(Piece.Color.WHITE), new BoardSlot(7, 4));
		putPiece(new Bishop(Piece.Color.WHITE), new BoardSlot(7, 5));
		putPiece(new Knight(Piece.Color.WHITE), new BoardSlot(7, 6));
		putPiece(new Rook(Piece.Color.WHITE), new BoardSlot(7, 7));
	}

	private void createBlackPawns() {
		// create black pawns
		for(int i = 0; i < 8; i++) {
			putPiece(new Pawn(Piece.Color.BLACK), new BoardSlot(1, i));
		}
	}

	private void createWhitePawns() {
		// create white pawns
		for(int i = 0; i < 8; i++) {
			putPiece(new Pawn(Piece.Color.WHITE), new BoardSlot(6, i));
		}
	}

	private void putPiece(Piece p, BoardSlot slot) {
		pieces[slot.getRow()][slot.getCol()] = p;
		p.setSlot(slot);
	}
}
