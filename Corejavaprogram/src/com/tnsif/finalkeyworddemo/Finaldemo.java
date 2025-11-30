package com.tnsif.finalkeyworddemo;
//demo for final keyword
//variable
//method
//class
public final class Finaldemo {
	
    static int a=8;  // u cant change value
	
	static {
		a=9;
	}
	final void display() { // cant override
		System.out.println("welcome to java");
	}

}
