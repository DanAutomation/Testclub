package Lesson3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PreIntermediate_9 {
	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(reader.readLine());
		for(int i = 1; i <11; i++){
				System.out.println(a + " * " + i + " " + " = " + a * i);
			}
			System.out.println(" ");
		}
	}

