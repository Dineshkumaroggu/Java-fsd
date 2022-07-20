package lesson2;

public class Methodoverloading {
	
	public void area(int l,int b)
    {
         System.out.println("Area of rectangle: "+(2*l*b));
    }
    public void area(int r) 
    {
         System.out.println("Area of Circle : "+(3.14*r*r));
    }

    public static void main(String args[])
   {

    	Methodoverloading  ob=new Methodoverloading ();
    	
    	ob.area(4,5);
    	ob.area(5);  
   }

}
