package edu.oakland.helper;

public class Dark{
	public static void main(String[] args){
		new Dark().go1();
	}
	
	void go1(){
		int x = 0;
		go2(++x);
	}
	
	void go2(int y){
		int x = ++y;
		System.out.println(x);
	}
}