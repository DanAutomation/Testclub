package Lesson3;

import java.io.IOException;

public class Begginer_8 {

		 public static String setMeth1(String s, int n){ // method for realization logic
			String f = s.substring(0,n); // for String f assign previous inputed var s and substring var since 0 to n
			for(int i = 1; i < n; i++){ // bust of every element of array
				f = f + s.substring(0,n-i); // increase f on f and substring var s since 0 to n
			}
			return f; // return to result of method
		}
		 
		 public static void main(String[] args)  throws IOException { 
			 System.out.println(setMeth1("World",5)); // set condition and output method setMeth1
		 }	 
	}