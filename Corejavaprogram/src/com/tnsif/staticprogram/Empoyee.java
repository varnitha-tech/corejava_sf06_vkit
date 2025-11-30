package com.tnsif.staticprogram;
//demo for static variables
public class Empoyee {
	int eid;
	String name;
	static String companyname="TNS";
	
	// constructor 
	Empoyee(int e,String n){
		eid=e;
		name=n;
	}
	void display() {
		System.out.println(eid+" "+name+" "+companyname);
	}
	
	public static void main(String[] args) {
		Empoyee e1=new Empoyee(1,"ruth");
		Empoyee e2=new Empoyee(2,"rohan");
		
		e1.display();
		e2.display();
	}

}
