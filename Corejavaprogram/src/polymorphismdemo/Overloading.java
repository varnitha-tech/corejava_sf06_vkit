package polymorphismdemo;
//demo for method overloading
public class Overloading {
	
	int add(int a,int b) {
		return a+b;	
	}
	
	int add(int a,int b,int c) {
		return a+b+c;
	}
	public static void main(String[] args) {
	Overloading d=new Overloading();
	
	System.out.println(d.add(1, 2));
	System.out.println(d.add(1, 2, 3));
	}

}
