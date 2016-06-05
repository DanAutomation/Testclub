package Lesson3;

public class Begginer_10 {
		 public static void main(String[] args){
			 int n = 4;  // how many * will output
			 for (int k = 0; k <=n; k++){ // bust of quantity elements for output
				 for(int y = 0;  y <k ; y++){ // bust of subelements 
					 System.out.print("*"); // what will output since first element (up)?
				 }
			   System.out.println(); // nextline 
			 }		 
			 for(int i = 0; i <= n; i++){  // same procedure witch described upper but since last element (middle row) till first (output down)
				 for(int j = 1; j < n - i; j++){ // bust of quantity elements for output
				 System.out.print("*"); //what will output since last element (down)?
			 }
			 System.out.println();
			 }
		}
	}

