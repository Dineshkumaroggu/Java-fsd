package lesson2;

public class Constructordemo {
	//declaration of variables
	int stdId;
	String stdName;
	String department;
	
	//default
	public Constructordemo() {
		stdId=1;
		stdName="raju";
		department="ece";
		
	}
	
    //when parameters passed
	public Constructordemo(int stdId,String stdName,String department) {
		this.stdId=stdId;
		this.stdName=stdName;
		this.department=department;

	}
	
	public void display() {
		System.out.println("Id: "+stdId);
		System.out.println("Name: "+stdName);
		System.out.println("Department: "+department);
		System.out.println();
		
	}
	
	public static void main(String[] args) {
		
		Constructordemo std= new Constructordemo();
		Constructordemo std2= new Constructordemo(2, "neeraj", "cse"); 

		//calling default constructor
		std.display();
		//parametrized constructor
		std2.display();
		
		 
	
	}


}
