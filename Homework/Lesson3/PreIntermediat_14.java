package Lesson3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PreIntermediat_14 {
	    public static void main(String [] args) throws IOException
	    {
	    	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	        String a = reader.readLine();
	        String b = "";
	        char[] c = a.toCharArray();
	        for (char ch : c) {
	            System.out.println (b + ch);
	            b += " ";
	        }
	    }
	}