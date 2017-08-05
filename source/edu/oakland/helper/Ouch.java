package edu.oakland.helper;

/**
* @author Blair T. Sibu
* @version 1.0
* @since 2017-7-12
*/
public class Ouch{
	static int ouch = 7;
	public static void main(String[] args){
		new Ouch().go(ouch);
		System.out.println(" " + ouch);
	}
	/**
	* This method increments the ouch variable and then prints it out.
	* @param {int} ouch static int variable passed in as 7
	*/
	void go(int ouch){
		ouch++;
		for(ouch = 3; ouch < 6; ouch++);
		System.out.print(" " + ouch);
	}
}