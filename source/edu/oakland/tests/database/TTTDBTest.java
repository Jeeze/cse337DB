package edu.oakland.test.database;

import edu.oakland.production.database.*;
import edu.oakland.helper.database.*;
import org.junit.*;
import static org.junit.Assert.*;

public class TTTDBTest{
	
    private int rowNumber = 0;
    private int colNumber = 1;
    private char markChar = 'X';
    private TTTDatabase database;
	
    //initializes the board, database, and writes to the board before each test
    @Before
    public void initializeSystem(){
        database = new TTTDatabase();
        database.writeToBoard(rowNumber, colNumber, markChar);
		
    }
    
    //tests to see whether the index at given row and column is indeed x
    @Test
    public void writeTest(){
        assertEquals(database.getCellValues(rowNumber, colNumber), 'X');
		
    }
	
}
