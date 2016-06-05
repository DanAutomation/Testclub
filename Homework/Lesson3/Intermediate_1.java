package Lesson3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Intermediate_1    {
public static void main(String [] args) throws NumberFormatException, IOException{

    int sum = 0;
    BufferedReader reader = new BufferedReader (new InputStreamReader(System.in)); // enter symbol from keyboard
    int a = Integer.parseInt(reader.readLine()); // convert to integer
    
    while(a != 0){ // condition 
         sum = sum + (a % 10); // sum of last symbol
         a /= 10; // take last symbol
    }
 System.out.println(sum + " "); // from next row
 }
}
