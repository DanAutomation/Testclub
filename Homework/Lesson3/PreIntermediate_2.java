package Lesson3;

import java.io.IOException;

public class PreIntermediate_2 {

	public static String swapMethod(String a){ // method for logical calculation, where input String a
		
		int b = a.length(); // number assign length of a
		if(b <= 1){ // is a has 1 symbol?
			return a; // get result
		}
		else {
			return a.charAt(b - 1) + a.substring(1, b) + a.charAt(0); // take string a and swap first and last letter in a
		}
    }
	
	public static void main(String[] args)  throws IOException { // method for input and output data for swapMethod
		System.out.println(swapMethod("Testclub"));
	}
}