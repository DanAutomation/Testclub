package Lesson3;

import java.io.IOException;

public class PreIntermediate_2 {
	public static void main(String[] args)  throws IOException {
		System.out.println(swapMethod("Testclub"));
	}
	public static String swapMethod(String a){
		
		int b = a.length();
		if(b <= 1){
			return a;
		}
		else {
			return a.charAt(b - 1) + a.substring(1, b) + a.charAt(0);
		}
    }
}