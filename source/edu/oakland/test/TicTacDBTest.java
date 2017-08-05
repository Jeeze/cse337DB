package edu.oakland.tests.database;

import edu.oakland.production.database.*;
import edu.oakland.helper.database.*;
import org.junit.*;
import static org.junit.Assert.*;

public class TicTacDBTest{

	private int rowNumber = 0;
	private int colNumber = 1;
	private String markChar = "x";
	private Gameboard gameboard;
	private Database database;
	private char[][] board;
	
	@Before
	public void initializeSystem(){
		gameboard = new Gameboard();
		gameboard.initializeBoard();
		database = new Database(rowNumber, colNumber, markChar, gameboard);
		writeToBoard(rowNumber, colNumber, markChar);
	}
	
	@Test
	public void writeTest(){
		assertEquals(board[0][1], "x");
	}
	
	@Test void passBoardTest(){
		assertTrue();
	}
	
}