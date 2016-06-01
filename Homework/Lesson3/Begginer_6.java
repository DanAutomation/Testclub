package Lesson3;

public class Begginer_6{

	public static void main(String[] args) {
		
		for (int i = 0; i < 51; i++){
			if(i % 2 == 0)
			System.out.print(i + " ");
		}
		System.out.println("---------------------------");
    int[] num = new int[50];
    for(int i = 0; i < num.length; i++){
    	num[i] = i + 2;
    	if(i % 2 == 0)
    	System.out.println(num[i]  + " ");
    }
	    System.out.println("---------------------------");
	    int a = 0;
		while(a > 0 && a < 51 && a%2==0){
			System.out.print(a++ + " ");
		}
		System.out.println("---------------------------");
		int i = 0;
		do {
		    i++;
		    if(i%2==0)
		    System.out.println(i  + " ");
		} while (i < 51);
	    System.out.println("---------------------------");
	  }
	}