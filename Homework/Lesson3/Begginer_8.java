package Lesson3;

import java.io.IOException;

public class Begginer_8 {
	 public static void main(String[] args)  throws IOException { 
		 System.out.println(setMeth1("World",5));
	 }	 
		 public static String setMeth1(String s, int n){
			String f = s.substring(0,n);
			for(int i = 1; i < n; i++){
				f = f + s.substring(0,n-i);
			}
			return f;
		}
	}