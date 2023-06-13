package hw03;

/**
* This class implements the methods form the {@code MyArray} class.
* 
* 
* 
* 
* @author Roger Roldan, 400986323, CS 2013- 01/02
* 
* 
*/

public class Main {
	public static void main(String[] args) {
		/**
		 * 
		 */
		MyArray<Integer> array = new MyArray<Integer>(5);
		MyArray<Integer> array2 = new MyArray<Integer>(5);
		MyArray<Integer> array3 = new MyArray<Integer>(5);
		
		MyArray<String> array4 = new MyArray<String>(5);
		MyArray<String> array5 = new MyArray<String>(5);
		// random ahh numbers 
		Integer[] list = {5,4,3,2,1};
		// favorite iron maiden song!
		String[] list2 = {"The", "Number", "Of", "The", "Beast"};
		
		array.put(0,2);
		array.put(1,1);
		array.put(2,7);
		array.put(3,4);
		array.put(4,5);
		
		
		
		array2.put(0,2);
		array2.put(1,1);
		array2.put(2,7);
		array2.put(3,4);
		array2.put(4,5);
		
		
		
		array3.put(0,1);
		array3.put(1,2);
		array3.put(2,3);
		array3.put(3,4);
		array3.put(4,5);
		
		
		array4.put(0,"hello");
		array4.put(1,"my");
		array4.put(2,"name");
		array4.put(3,"is");
		array4.put(4,"Roger");
		
		
		array5.put(0,"hello");
		array5.put(1,"my");
		array5.put(2,"name");
		array5.put(3,"is");
		array5.put(4,"Mike");
		
	    //System.out.println(array);
		//System.out.println(array2);
		
		//System.out.println(array.equals(array2));
		
		//array2.leftShift(2);
		//System.out.println(array2);
		
		//array.put(0, 3, list);
		//System.out.println(array);
		
		//System.out.println(array);
	    //array.sort();
		//System.out.print(array);
		
		//System.out.println(array4.equals(array5));
		
		//array4.leftShift(2);
		//System.out.println(array4);
		
		
		//System.out.println(array5);
		//for(int i = 0; i < list2.length; i++) {
		//	System.out.print(list2[i] + ", ");
		//}
		//System.out.println("");
		//array5.put(0, 3, list2);
		//System.out.println(array5);
		
		
		
		
		
		
		
		
	}
}
