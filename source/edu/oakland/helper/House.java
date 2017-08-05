package edu.oakland.helper;
import edu.oakland.homework.*;

/**
* @author Blair T. Sibu
* @version 1.0
* @since 2017-7-12
*/
public class House extends Building{
	 public House(){
		System.out.print("h ");
	}
	
	 public House(String name){
		this();
		System.out.println("hn " + name);
	}
	
	public static void main(String[] args){
		new House("x ");
	}
}