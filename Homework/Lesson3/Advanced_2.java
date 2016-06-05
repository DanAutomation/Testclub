package Lesson3;


public class Advanced_2 {
	
	public static String ToRomNum(int input) { 
	    if (input < 1 || input > 3999) // range of integers
	        return "Invalid Roman Number Value";
	    String s = ""; 
	    while (input >= 1000) { // if number bigger than 1000
	        s += "M"; // assign "M"
	        input -= 1000; // which contain 1000, 2000
	        }
	    while (input >= 900) { // if number bigger than 900
	        s += "CM"; // assign "CM"
	        input -= 900; // use if contain 900
	    }
	    while (input >= 500) { // if number bigger than 500
	        s += "D"; // assign "D"
	        input -= 500; //where is 500, 1000, 1500, 2000, 2500, 3000, 3500
	    }
	    while (input >= 400) { // if number bigger than 400
	        s += "CD"; // assign "CD"
	        input -= 400; // if contain 400
	    }
	    while (input >= 100) { // if number bigger than 100
	        s += "C"; // assign "C"
	        input -= 100; // use if contain 100
	    }
	    while (input >= 90) { // if number bigger than 90
	        s += "XC"; // assign "XC"
	        input -= 90; // use if contain 90
	    }
	    while (input >= 50) { // if number bigger than 50
	        s += "L"; // assign "L"
	        input -= 50; // use if contain 50
	    }
	    while (input >= 40) { // if number bigger than 40
	        s += "XL"; // assign "XL"
	        input -= 40; // use if contain 40
	    }
	    while (input >= 10) { // if number bigger than 10
	        s += "X"; // assign "X"
	        input -= 10; // 10, 20, 30
	    }
	    while (input >= 9) { // if number bigger than 9
	        s += "IX"; // assign "IX"
	        input -= 9; // 9
	    }
	    while (input >= 5) { // if number bigger than 5
	        s += "V"; // assign "V"
	        input -= 5; // from 5 to 9 and 
	    }
	    while (input >= 4) { // if number bigger than 4
	        s += "IV"; // assign "IV"
	        input -= 4; // 4
	    }
	    while (input >= 1) { // if number bigger than 1
	        s += "I"; // assign "I"
	        input -= 1; // from 1 to 4
	    }    
	    return s;
	}
	
	public static void main(String[] args){
		System.out.println(ToRomNum(1000));
	}
}