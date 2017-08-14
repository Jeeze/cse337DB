package edu.oakland.production.database;

import edu.oakland.helper.database.*;

public class TicTacDatabase{
	private Gameboard gameboard;
	private int rowNumber, colNumber;
	private char markChar;
	private char[][] board;
	
	public TicTacDatabase(int rowNumber, int colNumber, char markChar, Gameboard gameboard){
		this.rowNumber = rowNumber;
		this.colNumber = colNumber;
		this.markChar = markChar;
		this.gameboard = gameboard;
		board = gameboard.getBoard();
		
	}
	
	public void writeToBoard(int row, int col, char mark){
		board[row][col] = markChar;
	
	}
	
	public char[][] getBoardStatus(){
		return board;
	
	}
	
	public char getCellValues(int row, int col){
		return board[row][col];
	
	}
}