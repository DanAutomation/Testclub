package Lesson3;

public class Begginer_2 {

	public boolean main1(int x, int y){	  // method with 2 parameters for realization logic 
		if(x == 10 || y == 10 || x+y ==10){  // check conditions of task
			return true; // return if conditions satisfy
		}else{  // or
		return false;}  //  return if conditions satisfy
	}
	
	public static void main(String[] args){  // method main for input / output data
		Begginer_2 a = new Begginer_2(); // instance of the class
		System.out.println(a.main1(-2, 12)); // invocation of method and output
	}
}
