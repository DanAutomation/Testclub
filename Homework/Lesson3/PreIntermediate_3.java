package Lesson3;

import java.io.IOException;

public class PreIntermediate_3 {
	public static void main(String[] args) throws IOException {
		System.out.println(method(4, 5));
	}
	public static boolean method(int a, int b){
		if(a == 21 || b == 21 || a+b == 21){
		return true;}
		else{
			return false;
		}
	}
	
}
