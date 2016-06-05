package Lesson3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PreIntermediate_9 {
	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); // input symbol since consol
		int a = Integer.parseInt(reader.readLine()); // convert to integer
		for(int i = 1; i <11; i++){ // quantity of numbers, which will multiply
				System.out.println(a + " * " + i + " " + " = " + a * i); // output multiply 2 numbers
			}
			System.out.println(""); // next row
		}
	}

