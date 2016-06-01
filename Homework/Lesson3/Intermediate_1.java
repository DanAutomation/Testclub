package Lesson3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Intermediate_1    {
public static void main(String [] args) throws NumberFormatException, IOException{

    int sum = 0;
    BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
    int a = Integer.parseInt(reader.readLine());
    
    while(a != 0){
         sum = sum + (a % 10);
         a /= 10;
    }
 System.out.println(sum + " ");
 }
}
