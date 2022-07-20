package lesson1;

public class TypeCasting {
	public static void main(String[] args) {
		
		//implicit conversion of char to other
		System.out.println("Implicit Type Casting");
		char a='A';
		System.out.println("Value of A in char : "+a);
		
		int b=a;
		System.out.println("Value of A in int: "+b);
		
		float c=a;
		System.out.println("Value of A in float: "+c);
	
		double d=a;
		System.out.println("Value of A in double: "+d);
		
		System.out.println("\n");
		int num1=55;
		float num2=num1;
		System.out.println("Interger to float "+num2);
		
				
		System.out.println("\n");
		
		System.out.println("Explicit Type Casting");
		//explicit conversion
		
		double x=45.5;
		int y=(int)x;
		System.out.println("Value of y: "+y);
		
		String s="5";
		int num = Integer.parseInt(s);
		System.out.println("Sting to number "+num);
			
		
	}

}
