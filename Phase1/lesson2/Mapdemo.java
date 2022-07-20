package lesson2;
import java.util.*;
public class Mapdemo {
	public static void main(String[] args) {
HashMap<Integer,String> map=new HashMap<Integer, String>();
		
		map.put(1, "A");
		map.put(2, "B");
		map.put(3, null); 
		map.put(null, "C"); 
	

		
		System.out.println(map);
		System.out.println("Get element at key 3: "+map.get(3));
		System.out.println("Get element at key null: "+map.get(null));
		//if not present a key
		System.out.println("Get element at key 6: "+map.get(6));
		
		//to remove element by key
		
		map.remove(3);
		
		System.out.println(map);
		
	

	}
}
