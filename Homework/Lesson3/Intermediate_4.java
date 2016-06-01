package Lesson3;

import java.io.IOException;


public class Intermediate_4  	 {
 	public static void main(String []args) throws IOException{
 	String a = "23425sdf";
 	int len = a.length();
 	int res = 0;
 	for (int i = 0; i < len; i++) {
 	    Character char1 = a.charAt(i);
 	    if (Character.isDigit(char1)) {
 	        res += Character.getNumericValue(char1);
 	    }
 	}
 	System.out.println(res);
}
}
