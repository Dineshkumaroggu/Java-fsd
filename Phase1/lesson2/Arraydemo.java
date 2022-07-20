package lesson2;

public class Arraydemo {
	public static void main(String[] args) {
		int array[]= {12,23,34,45,56,78,99};
		
		System.out.println("Element at index 3: "+ array[3]);
		
		System.out.println("Length of an Array: "+array.length);
		
		System.out.println("Access using for loop\n");
		
		for (int i=0;i<array.length;i++) {
			
			System.out.println(array[i]);
			
		}
		
		System.out.println();
		
		
		for(int a: array) {
			System.out.print(a+ " ");
		}
	}

}
