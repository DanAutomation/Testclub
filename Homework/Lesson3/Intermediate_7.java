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
	int first[][] = new int[j][i];
	int second[][] = new int[j][i];
	int sum[][] = new int[j][i];
	
	for(k = 0; k < i; k++)
		for(l = 0; l < j; l++)
			first[k][l] = Integer.parseInt(reader.readLine());
	
	for(k = 0; k < i; k++)
		for(l = 0; l < j; l++)
			second[k][l] = Integer.parseInt(reader.readLine());

	for(k = 0; k < i; k++)
		for(l = 0; l < j; l++)
			sum[k][l] = first[k][l] + second[k][l];
	
	for(k = 0; k < i; k++)
	{
		for(l = 0; l < j; l++)
			System.out.println(sum[k][l]+"\t");
		System.out.println();
	}
}
}