package Lesson3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Advanced_3_main {
	public static void main(String[] args) throws IOException, NumberFormatException {

		Advanced_3_metrics var = new Advanced_3_metrics(); // instance of class
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter quantity of passed TCs: "); // what to do
		int a = Integer.parseInt(reader.readLine()); // do
		System.out.println("Enter quantity of failed TC: "); // what to do
		int b = Integer.parseInt(reader.readLine()); // do

		if (var.isMoreThan20(a, b)) { // is less 20&
			var.generateReport("Something happen wrong, remember that every successful release has less than 20% failed TC"); //generate report		
		}
		
		if (!var.isTestFail()) { // was correct previous test?
			System.out.println("Enter quantity unresolved issues with high priority: "); // what to do
			int c = Integer.parseInt(reader.readLine()); // do
			if (var.isHighPrior(c)) { // is satisfy of requirements?
				System.out.println("bugs with high priority satisfy client's requirement"); // print 
			} else { 
				var.generateReport("programm working not stable. " + "Quantity unresolved issues with HIGH priority is more than enough," + "\r" + "remember about requirements of client"); // generate report
			}
		}
		
		if (!var.isTestFail()){ // was correct previous test?
			System.out.println("Enter quantity unresolved issues with Blocker and Critical severity: "); // what to do
			int d = Integer.parseInt(reader.readLine()); // do
			if (var.isBlockCritical(d)) { //critical bugs enough?
				System.out.println("Programm work stable"); // get good result
				if(var.happyWife(a, b)){ // increase chances on sex with wife?
					System.out.println("and your wife should be happy too"); // good for you
				}
			} else {
				var.generateReport("Programm work not stable. Quantity of bugs with Blocker and Critical severity is more than enough"  + "\r"); // why was problems
			}
		}
	}
}