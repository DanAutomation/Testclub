package Lesson3;

public class Intermediate_5 {

	
	public static class Intermediate_5_KelvinToCelsiy { 
		private double kelv; 

		public double getKelv() { // getter
			return kelv;
		}
		public void setKelv(double kelv) { // convert to kelvin
			this.kelv = kelv - 273.15;
		}
	}
	
	public static class Intermediate_5_CelsiyToKelvin {
		private double cels;

		public double getCels() { // getter
			return cels;
		}
		public void setCels(double cels) { // convert to celsiy
			this.cels = cels + 273.15;
		}
	}
	

	public static void main(String[] args) {
		Intermediate_5_KelvinToCelsiy toKelv = new Intermediate_5_KelvinToCelsiy(); // instance of class
		toKelv.setKelv(10); // convert 10 celsiy to kelvin
		System.out.println(toKelv.getKelv()); // output
		Intermediate_5_CelsiyToKelvin toCels = new Intermediate_5_CelsiyToKelvin(); // instance of class
		toCels.setCels(100); // convert 100 kelvin to celsiy
		System.out.println(toCels.getCels()); // output
	}
}
