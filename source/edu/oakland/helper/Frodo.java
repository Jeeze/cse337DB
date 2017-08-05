package edu.oakland.helper;
import edu.oakland.homework.*;

/**
* @author Blair T. Sibu
* @version 1.0
* @since 2017-7-12
*/

public class Frodo extends Hobbit{
	
	public static void main(String[] args){
		short myGold = 7;
		Frodo f = new Frodo();
		System.out.println(f.countGold(myGold, 6));
	}
}

