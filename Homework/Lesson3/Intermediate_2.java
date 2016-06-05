package Lesson3;

import java.io.IOException;

public class Intermediate_2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
    int sum = 0; // var for counting sum
    for(int i = 000001; i <= 999999; i++){ // bust of all variants
    	int a = i/100000; // 1st elem
    	int b = (i/10000)%10; // 2nd elem
    	int c = (i/1000)%10; // 3rd elem
    	int d = (i/100)%10; // 4th elem
    	int e = (i/10)%10; // 5th elem
    	int f = i%10; // last elem
    	if(a + b + c == d + e + f){ // check first three elem with 3 last elems
    		sum++; // increase after realization digits
    	}
    }
    System.out.println(sum);
	    }
	}
