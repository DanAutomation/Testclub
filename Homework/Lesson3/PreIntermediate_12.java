package Lesson3;

public class PreIntermediate_12 {
	

	public static void main(String[] args){
	int a = 0;
	int b = 234;
	while(b != 0){
		a += b % 10;
		b /= 10;
	}
	System.out.println(a);
}
}

