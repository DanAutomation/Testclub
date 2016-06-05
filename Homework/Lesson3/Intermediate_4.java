package Lesson3;

import java.io.IOException;


public class Intermediate_4  	 {
 	public static void main(String []args) throws IOException{
 	String a = "23425sdf";
 	int len = a.length(); // length of string
 	int res = 0; // initialize var
 	for (int i = 0; i < len; i++) { // run increment
 	    Character char1 = a.charAt(i); // translate string a (every elem) to char and invested to char1
 	    if (Character.isDigit(char1)) { // is digit?
 	        res += Character.getNumericValue(char1); // sum every digital
 	    }
 	}
 	System.out.println(res);
}
}
