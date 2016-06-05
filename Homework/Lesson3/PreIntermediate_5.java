package Lesson3;

public class PreIntermediate_5 {

	   public static boolean meth(int[] arr, int num) {
			      for (int n : arr) { // bust of every element of array
			         if (num == n) { // found?
			            return false; // do if found
			         }
			      }
			      return true; // do after last element
			   }
	   
	   public static void main(String[] args) {
		      int[] arr = { 2, 12, 85, 6, 13, 45, 87, 7, 67, 89 }; // array
		      System.out.println(meth(arr, 7)); // output meth with certain data
		      System.out.println(meth(arr, 9)); // output meth with certain data
		   }
			}
	