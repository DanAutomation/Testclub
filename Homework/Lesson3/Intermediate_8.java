package Lesson3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Intermediate_8 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String a = reader.readLine(); // assigned string from keyboard
		String[] b = a.split("(?=\\p{Upper})"); // split to upper-case
		for (int i = 0; i < b.length; i++){ // every element
			System.out.print(b[i] + " "); // + space to upper
		}

	}

}
