package Lesson3;

public class PreIntermediate_12 {
	

	public static void main(String[] args){
	int a = 0; // initialize counter
	int b = 234; // initialize search of key
	while(b != 0){ // isn't equal 0?
		a += b % 10; // take last element (4)
		b /= 10; // cut last element and leave first two
	}
	System.out.println(a); 
}
}

