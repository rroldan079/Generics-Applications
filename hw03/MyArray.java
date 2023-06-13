package hw03;

/**
 * This class runs implements several methods (including generic methods)
 * that can manipulate the contents of arrays of any data type.
 * 
 * 
 * <br />
 * 
 * @author Roger Roldan, 400986323, CS 2013- 01/02
 * 
 * 
 */

import java.util.Random;

public class MyArray<E extends Comparable<E>> {
    /**
     * 
     */
    private E[] data;

    @SuppressWarnings("unchecked")
	public MyArray(int size) {
        this.data = (E[])(new Comparable[size]);
    }

    //This constructor can accept an array or a comma-separated list of values.
    @SuppressWarnings("unchecked")
	public MyArray(E[] elements) {
        this.data = (E[]) (new Comparable[elements.length]);
        //Make a deep copy to prevent shared references.
        System.arraycopy(elements, 0, this.data, 0, elements.length);
    }
    
    //Add other methods.
    /**
     * 
     * @param index position of {@code this.data} 
     * @return this.data value at given index position casted to generic type.
     */
    public E get(int index) {
    	return (E)(this.data[index]);
    }
    
    /**
     * 
     * @param start starting index position
     * @param end ending index position
     * @return array inserted from index start to end in {@code MyArray} 
     */
    public MyArray<E> get(int start, int end) {
    	MyArray<E> array = new MyArray<>((end-start) + 1);
    	for(int i = 0; i < end; i++) {
    		if(i == end) {
    			break;
    		}
    		else {
    			array.put(i, this.data[i]);
    		}
    	}
		return array;
    }
    
    /**
     * a
     * @param index index position of {@code this.data}
     * @param value value to be inserted into {@code this.data} at given index
     * position;
     * 
     * value is inserted into a given index position of {@code this.data} array
     */
    public void put(int index, E value) {
    	this.data[index] = value;
    }
    
    /**
     * 
     * @param start starting index position
     * @param end ending index position
     * @param array generic type array
     * 
     * 
     */
    public void put(int start, int end, E[] array) {
    	for(int i = 0; start < end; i++) {
    		this.data[start] = array[i];
    		start += 1;
    	}
    }
    
    
    public boolean equals(MyArray<E> obj) {
    	MyArray<E> obj1 = new MyArray<E>(this.data);
    	
    	for(int i = 0; i < obj1.size(); i++) {
    		if(obj1.get(i) != obj.get(i)) {
    			return false;
    		}
    	}
    	return true;
    }
    
    /**
     * 
     * @return max value of the array
     */
    public E max() {
    	E max = null;
    	for(int i = 1; i < (this.data).length; i++) {
    		for(int j = 0; j < (this.data).length; j++) {
    			if((this.data)[i].compareTo(this.data[j]) > 1) {
    				(this.data)[i] = max;
    			}
    		}
    	}
    	return max;
    }
    
    /**
     * 
     * @return minimum value of the array
     */
    public E min() {
    	E min = null;
    	for(int i = 1; i < (this.data).length; i++) {
    		for(int j = 0; j < (this.data).length; j++) {
    			if((this.data)[i].compareTo(this.data[j]) < 1) {
    				(this.data)[i] = min;
    			}
    		}
    	}
    	return min;
    }
    
    /**
     * 
     * @return {@code this.data} reversed array
     */
    public E[] reverse(){
    	for(int i = 0; i < (this.data).length; i++) {
             int j = (this.data).length;
    		(this.data)[i] = (this.data)[j];
    		(this.data)[j] = (this.data)[i];
    		 j--;
    		
    	}

    	return this.data;
    	
    }
    
    /**
     * 
     * @return {@code this.data} shuffled array
     */
    public E[] shuffle() {
    	
    	Random rnd = new Random();
    	for(int i = 0; i < (this.data).length; i++) {
    		(this.data[i]) = (this.data[rnd.nextInt((this.data).length)]);	
    	}
    	return this.data;
    }
    
    /**
     * 
     * @param shiftDistance index position change
     */
    public void rightShift(int shiftDistance) {
    	for(int j = 0; j < shiftDistance; j++) {
    		E tempIndex = (this.data)[0];
        	
        	for(int i = 0; i < (this.data).length - 1; i++) {
        		(this.data)[i] = (this.data)[i - 1];
        	}
        	(this.data)[(this.data).length + 1] = tempIndex;
    	}
    	}
    	
    
    
    /**
     * 
     * @param shiftDistance index position change
     */
    public void leftShift(int shiftDistance) {
    	
    	for(int j = 0; j < shiftDistance; j++) {
    		E tempIndex = (this.data)[0];
        	
        	for(int i = 0; i < (this.data).length - 1; i++) {
        		(this.data)[i] = (this.data)[i + 1];
        	}
        	(this.data)[(this.data).length - 1] = tempIndex;
    	}
    }
    
    
    /**
     * 
     * @return size of the {@code this.data}
     */
    public int size() {
    	return (this.data).length;
    }
    
    /**
     * returns string version of the array
     */
    public String toString(){
    	String array = " ";
    	for(int i = 0; i < (this.data).length; i++) {
    		array += (this.data)[i] + ", ";
    	}
    	
    	return array;
    }
    
    /**
     * sorts the array from least to greatest. 
     */
    public void sort() {
    	for(int i = 0; i < (this.data).length;i++) {
    		for(int j = i + 1; j < (this.data).length;j++) {
    			E max = null;
    			if((this.data)[i].compareTo((this.data)[j]) > 0) {
    				max = (this.data)[i];
    				(this.data)[i] = (this.data)[j];
    				(this.data)[j] = max;
    			}
    		}
    	}
    }
    
    
    
    
    
    
    

    
    
}
