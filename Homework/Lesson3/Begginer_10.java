package Lesson3;

public class Begginer_10 {
	 public static void main(String[] args){
		 int n = 10;
		 for (int k = 0; k <=n; k++){
			 for(int y = 0;  y <k ; y++){
				 System.out.print("*");
			 }
		   System.out.println();
		 }		 
		 for(int i = 0; i <= n; i++){
			 for(int j = 1; j < (n + 1) - i; j++){
			 System.out.print("*");
		 }
		 System.out.println();
		 }
	}
}