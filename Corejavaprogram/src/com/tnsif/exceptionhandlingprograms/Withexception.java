package com.tnsif.exceptionhandlingprograms;
//with exception
public class Withexception {
	public static void main(String[] args) {
		System.out.println("java");
		@SuppressWarnings("unused")
		int d=0;
		System.out.println("welcome");
		
		try {
		@SuppressWarnings("unused")
		int a=55/0;//exception 
		}
		catch(Exception e) {
			System.out.println("caught"+e);
		}
		System.out.println("hello");
	}

}
