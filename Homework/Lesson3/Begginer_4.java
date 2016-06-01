package Lesson3;

public class Begginer_4 {
	
	public int meth(int[] arr, int i) {
		int quont = 0;
		int searchNum = 0;

		for(i=0; i<arr.length; i++){
			if(arr[i] == searchNum){
				 quont = i - 1;
			}
		}
		return quont;
	}
}