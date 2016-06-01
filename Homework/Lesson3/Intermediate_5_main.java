package Lesson3;

public class Intermediate_5_main {

	public static void main(String[] args) {
		Intermediate_5_KelvinToCelsiy toKelv = new Intermediate_5_KelvinToCelsiy();
		toKelv.setKelv(10);
		System.out.println(toKelv.getKelv());
		Intermediate_5_CelsiyToKelvin toCels = new Intermediate_5_CelsiyToKelvin();
		toCels.setCels(100);
		System.out.println(toCels.getCels());
	}
}
