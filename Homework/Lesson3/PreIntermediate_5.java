package Lesson3;

public class PreIntermediate_5 {
	   public static void main(String[] args) {
		      int[] arr = { 2, 12, 85, 6, 13, 45, 87, 7, 67, 89 };
		      System.out.println(meth(arr, 7));
		      System.out.println(meth(arr, 9));
		   }
	   public static boolean meth(int[] arr, int num) {
			      for (int n : arr) {
			         if (num == n) {
			            return false;
			         }
			      }
			      return true;
			   }
			}
	