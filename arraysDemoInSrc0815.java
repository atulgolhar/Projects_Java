package introductionTry3;

public class arraysDemoInSrc0815 {

	// so far we have seen primitive data types
	// and strings which is the reference data type
	// these store one value
	// arrays can store multiple values of the same type
	// create new class in the default src folder
	
	// string stores 1 value
	// int stores 1 value
	// array can store multiple values thus its a linear bucket of objects
	// define the name of the array and define the size of the array
	// all the elements must be the same 
	// length function built-in can be used for arrays
	
	public static void main(String[] args) {
		int[] myIntArray1; 				// create the reference
										// new keyword reserves space in memory for the elements to be saved
										// which elements? integer values (each integer is 32 bit)
										// how many? 10 integer values
		myIntArray1 = new int[10];		// initialize new array using [] square brackets which makes it an array
										// now begin inserting integer values into the array
										// how to give values? access the array by the index 
										// index is 0 based
		myIntArray1[0] = 100; 			// first value in the array
		System.out.println("0 index element is: " + myIntArray1[0]);
	}

}
