package Lesson3;

import java.util.Random;

public class Advanced_1 {

	
    public static String genPass(int leng) {
        String pass  = ""; // initialize var
        Random arr = new Random(); // instance of random array
        int string = leng + arr.nextInt(leng); // in var string, which were entered previous + 1 of switch 

        for (int i = 0; i < string; i++) { // run iteraction
            char value = 0; // char value is
            int quontOfVal = 15; 
            
            switch(arr.nextInt(3)) { // switch
                case 0: {value = '0'; quontOfVal = 10;} // pay attention in names
                     break;
                case 1: {value = 'a'; quontOfVal = 26;} 
                     break;
                case 2: {value = 'A'; quontOfVal = 26;} 
                     break;
            }
            pass += (char)((arr.nextInt(quontOfVal)) + value); // describe what type and what quantity will in pass var, without space
        }
        return pass;
    }
    
    public static void main(String argv[]) {
        String pass = genPass(15); 
        System.out.print(pass);
    }

}
