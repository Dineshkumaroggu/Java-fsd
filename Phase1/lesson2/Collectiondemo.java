package lesson2;
import java.util.*;

public class Collectiondemo {
	public static void main(String[] args) {
		
		//creating arraylist
		  System.out.println("ArrayList");
		  ArrayList<String> names=new ArrayList<String>();   
	      names.add("raju");//
	      names.add("Ramu");    	   
	      System.out.println(names);  
		
		//creating vector
	      System.out.println("\n");
	      System.out.println("Vector");
	      @SuppressWarnings({ "unchecked", "rawtypes" })
		Vector<Integer> age = new Vector();
	      age.addElement(20); 
	      age.addElement(30); 
	      System.out.println(age);
		
		//creating linkedlist
	      System.out.println("\n");
	      System.out.println("LinkedList");
	      LinkedList<String> dept=new LinkedList<String>();  
	      dept.add("front-end");  
	      dept.add("back-end");  	
	      System.out.println(dept);
	      

	       //creating hashset
	       System.out.println("\n");
	       System.out.println("HashSet");
	       HashSet<Integer> set=new HashSet<Integer>();  
	       set.add(101);  
	       set.add(103);  
	       set.add(102);
	       set.add(104);
	       System.out.println(set);
	       
	       //creating linkedhashset
	       System.out.println("\n");
	       System.out.println("LinkedHashSet");
	       LinkedHashSet<Integer> set2=new LinkedHashSet<Integer>();  
	       set2.add(11);  
	       set2.add(13);  
	       set2.add(12);
	       set2.add(14);	       
	       System.out.println(set2);
	     
	      }  

}
