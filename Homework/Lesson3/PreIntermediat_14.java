package Lesson3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PreIntermediat_14 {
	    public static void main(String [] args) throws IOException
	    {
	    	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); // enter symbol from console
	        String a = reader.readLine(); // output symbol
	        String b = ""; // initialize string
	        char[] c = a.toCharArray(); // convert string to char, which were inputed from keyboard
	        for (char ch : c) { // bust of all elements char[] c
	            System.out.println (b + ch); // output with b (space, which increase)
	            b += " "; 
	        }
	    }
	}