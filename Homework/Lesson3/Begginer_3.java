package Lesson3;

public class Begginer_3 {
		public static boolean main1(int a){  // for realization logic
			while(a > 0){ // condition
			if(a%3==0 || a%5==0){ // check validation how number divide on 3 or 5
			return true;  // If condition is executing - true
		}else{ 
			return false; // execute if number not 5 or 3
		}
     }
			return false; // condition for realization method main1
		}
		public static void main(String[] args){ // method main for input / output data
			System.out.println(Begginer_3.main1(8)); //input and output data
		}
}
