package Lesson3;

public class Begginer_6{

	public static void main(String[] args) { 
		
		for (int i = 0; i < 51; i++){ // bust of numbers since 0 to 50
			if(i % 2 == 0) // if divide to 2
			System.out.print(i + " "); // output through space
		}
		System.out.println("---------------------------");
    int[] num = new int[50]; // array of numbers
    for(int i = 0; i < num.length; i++){ // bust of numbers since 0 to 50
    	num[i] = i + 2; // add 2 for every number
    	if(i % 2 == 0) // if divide to 2
    	System.out.println(num[i]  + " "); // output through space
    }
	    System.out.println("---------------------------");
	    int a = 0; // initialization of variable
		while(a > 0 && a < 51 && a%2==0){ // while bust of numbers since 0 to 50
			System.out.print(a++ + " "); // output through space
		}
		System.out.println("---------------------------");
		int i = 0; // initialization of variable
		do { // begin do
		    i++; // increase i with every iteration
		    if(i%2==0) // if divide to 2 without residue
		    System.out.println(i  + " "); // output through space
		} while (i < 51); // condition for do 
	    System.out.println("---------------------------");
	  }
	}