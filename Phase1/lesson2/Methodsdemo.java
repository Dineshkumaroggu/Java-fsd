package lesson2;

public class Methodsdemo {

	public void display(String name) {
		
		System.out.println("Display content is "+name);
	}
	
	public int square(int n) {
		return n*n;
	}

	public int cube(int n) {
		
		return n*n*n;
	}

	

	
	public static void main(String[] args) {
		
		Methodsdemo obj=new Methodsdemo();
		
		int cube=obj.cube(5);
		System.out.println("Cube of 5 is: "+cube);
		
		int sq=obj.square(5);
		System.out.println("Sqare of 2 is: "+sq);
		
		
	}


}
