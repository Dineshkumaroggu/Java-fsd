package lesson2;

public class Stringdemo {
	public static void main(String[] args) {
		String s1 = new String("Hello World");
		 
		 char c= s1.charAt(2);
		 System.out.println("Character at index 2: "+c);
		 System.out.println("Length: "+s1.length());
		 
		 System.out.println("UPPER CASE: "+s1.toUpperCase());
		 System.out.println("lowercase: "+s1.toLowerCase());
	
		 System.out.println("Check the String contains word : world or not? : "+s1.contains("World"));
		 System.out.println("SubString between 6 to 10 characters: "+s1.substring(6,10));
		 
		 String result[]= s1.split(" ");
		 
		 for(String s: result) {
			 System.out.println(s);
		 }
		 
		 //comparison
		 
		 String s2= "hello world";
		 //case of equal
		 if(s1.equals(s2)) {
			 System.out.println("Validated");
		 }
		 else {
			 System.out.println("Not Valid");
		 }
		 
		 
		 //case of equal ignorecase
		 if(s1.equalsIgnoreCase(s2)) {
			 System.out.println("Validated");
		 }
		 else {
			 System.out.println("Not Valid");
		 }
		 
		 
		 
	
	}
}
