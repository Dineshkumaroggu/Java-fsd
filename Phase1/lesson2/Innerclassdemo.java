package lesson2;

public class Innerclassdemo {
	
		
		public void dispaly() {
			
			class Inner{
				
				int a=10;
				
				void print() 
				{
					System.out.println("Method of inner class");
					System.out.println("Value of a : "+a);
				}
				
			}
			
			Inner inner= new Inner();
			inner.print();
	
			
		}
		
		public static void main(String[] args) {
			
			Innerclassdemo outer= new Innerclassdemo();
			outer.dispaly();
			
		

	}
}
