package Lesson3;

import java.util.ArrayList;

public class Intermediate_3 
{
	public static void main(String[] args){
		int[] nums = {1, 17, 24, 31, 44, 18, 27};

	}	
        static int[] reverse3(int[] nums) {
        	  int[] rev = new int[nums.length]; 
        	  int count = nums.length-1;
        	  for(int num : nums) {
        	    rev[count] = num;
        	    count--;
        	  }
        	  return rev;
        	}
}


