package Lesson3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Advanced_3_main {
	public static void main(String[] args) throws IOException, NumberFormatException {

		Advanced_3_metrics var = new Advanced_3_metrics();
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter quantity of passed TCs: ");
		int a = Integer.parseInt(reader.readLine());
		System.out.println("Enter quantity of failed TC: ");
		int b = Integer.parseInt(reader.readLine());

		if (var.isMoreThan20(a, b)) {
			var.generateReport("Something happen wrong, remember that every successful release has less than 20% failed TC");		
		}
		
		if (!var.isTestFail()) {
			System.out.println("Enter quantity unresolved issues with high priority: ");
			int c = Integer.parseInt(reader.readLine());
			if (var.isHighPrior(c)) {
				System.out.println("bugs with high priority satisfy client's requirement");
			} else {
				var.generateReport("programm working not stable. " + "Quantity unresolved issues with HIGH priority is more than enough," + "\r" + "remember about requirements of client");
			}
		}
		
		if (!var.isTestFail()){
			System.out.println("Enter quantity unresolved issues with Blocker and Critical severity: ");
			int d = Integer.parseInt(reader.readLine());
			if (var.isBlockCritical(d)) {
				System.out.println("Programm work stable");
				if(var.happyWife(a, b)){
					System.out.println("and your wife should be happy too");
				}
			} else {
				var.generateReport("Programm work not stable. Quantity of bugs with Blocker and Critical severity is more than enough"  + "\r");
			}
		}
	}
}
