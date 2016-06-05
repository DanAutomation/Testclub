package Lesson3;

public class PreIntermediate_8 {
 
    public static void main(String[] args) {

		int a = 1; // initialize first var
		int b = 1; // initialize second var
		int sum; // initialize sum
		
		for(int i = 0; i < 201; i++){ // iteration first 100 odd numbers
			if(i % 2 - 1 ==0){ // is number odd?
			sum = a + b; // sum	
			a = b; // sign second number to first
			b = sum; // and sum to second number
			System.out.println(sum); // output
		}
		}
    }
}