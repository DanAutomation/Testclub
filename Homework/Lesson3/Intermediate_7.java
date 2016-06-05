package Lesson3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Intermediate_7 {
public static void main(String[] args)  throws IOException, NullPointerException{
	
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	int i = 0, j = 0, k = 0, l = 0;
	int a = Integer.parseInt(reader.readLine());
	int b = Integer.parseInt(reader.readLine());
	int first[][] = new int[j][i]; // first array
	int second[][] = new int[j][i]; // second array
	int sum[][] = new int[j][i]; // sum of arrays
	
	for(k = 0; k < i; k++) // run iteration
		for(l = 0; l < j; l++) // second part of first iteration
			first[k][l] = Integer.parseInt(reader.readLine()); // assigned all elements first array
	
	for(k = 0; k < i; k++) // run iteration
		for(l = 0; l < j; l++) // second part of second iteration
			second[k][l] = Integer.parseInt(reader.readLine()); // assigned all elements second array

	for(k = 0; k < i; k++) // run iteration
		for(l = 0; l < j; l++) // second part of sum iteration
			sum[k][l] = first[k][l] + second[k][l]; // assigned all elements sum array
	
	for(k = 0; k < i; k++) 
	{
		for(l = 0; l < j; l++)
			System.out.println(sum[k][l]+"\t"); // output sum
		System.out.println();
	}
}
}