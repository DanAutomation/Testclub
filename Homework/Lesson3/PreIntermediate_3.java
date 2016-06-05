package Lesson3;

import java.io.IOException;

public class PreIntermediate_3 {

	public static boolean method(int a, int b){ // method for logical calculation, input 2 integer numbers
		if(a == 21 || b == 21 || a+b == 21){ // is any of number is 21 or they sum is 21?
		return true;} // get true and finish method
		else{
			return false; // get false and finish method
		}
	}
	
	public static void main(String[] args) throws IOException { // method for input and output data for method
		System.out.println(method(4, 5));
	}
	
}
