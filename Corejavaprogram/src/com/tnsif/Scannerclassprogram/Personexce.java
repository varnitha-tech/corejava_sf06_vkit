package com.tnsif.Scannerclassprogram;

import java.util.Scanner;
public class Personexce {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("enter the person name");
			String name=sc.nextLine();
			System.out.println("enter the person income");
			int income=sc.nextInt();
			
			Person pp=new Person();  // object
			pp.setName(name);
			pp.setIncome(income);
			
			Taxcalculuculation t=new Taxcalculuculation();
			t.Caluculatetax(pp);
			
			System.out.println("after tax calucation ");
			System.out.println(pp);
		}
	}

}
