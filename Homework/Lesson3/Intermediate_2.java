package Lesson3;

import java.io.IOException;

public class Intermediate_2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
    int sum = 0;
    for(int i = 000001; i <= 999999; i++){
    	int a = i/100000;
    	int b = (i/10000)%10;
    	int c = (i/1000)%10;
    	int d = (i/100)%10;
    	int e = (i/10)%10;
    	int f = i%10;
    	if(a + b + c == d + e + f){
    		sum++;
    	}
    }
    System.out.println(sum);
	    }
	}
