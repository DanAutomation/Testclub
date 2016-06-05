package Lesson3;

public class Intermediate_3 
{

        static int[] reverse3(int[] nums) { 
        	  int[] rev = new int[nums.length]; // length of array, which was entered in condition
        	  int count = nums.length-1; // quantity elements of array 
        	  for(int num : nums) { // bust of every element array num
        	    rev[count] = num; // elements of num substitute to rev
        	    count--; // derease elems
        	  }
        	  return rev; // return result
        	}
        
    	public static void main(String[] args){
    		int[] nums = {1, 17, 24, 31, 44, 18, 27};
    		System.out.println(Intermediate_3.reverse3(nums));
    		
    	}
}


