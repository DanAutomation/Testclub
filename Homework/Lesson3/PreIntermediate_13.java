package Lesson3;

public class PreIntermediate_13 {
	public static void main(String[] args){
		int a = 1, b = 13, c = 36, d;
		double x1, x2;
		// x * x - 13 * x + 36 = 0
		d = b * b - (4 * a * c); // 25
		x1 = (((-1)*b) + Math.sqrt(d)) / (2 * a); // 
		x2 = (((-1)*b) - Math.sqrt(d)) / (2 * a); //
		System.out.println(d);
		System.out.println(x1);
		System.out.println(x2);

	}

}
