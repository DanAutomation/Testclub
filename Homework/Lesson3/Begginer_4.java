package Lesson3;


public class Begginer_4 {
	public static void main(String[] args) {
		 long[] arr = {1, 24, 58, 47, 12, 34, 66, 12, 54, 87, 78, 33}; // creation of array
		 int nElems = arr.length; // length of array
		 int j; // cycle counter
		 long val; // value of array 
		 val = 54; // search value with number 54
		 for(j=0; j<nElems; j++) // for every element
		 if(arr[j] == val) // is find?
			 nElems = j; // equal value witch found previous
			 System.out.println(nElems); // output
	}
}
