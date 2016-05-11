package Testclub;

public class MusicInstruments {
	public String name; //now it is internal attribute 
	public String countryOfProduce; //now it is internal attribute 
	public String groupOfInstrument; //now it is internal attribute 
	private String kindOfRegister; //now it is internal attribute 
	public String abelePlay; //now it is internal attribute 
	private String color; //now it is internal attribute 
	private int size; //now it is internal attribute 
	private int weight; //now it is internal attribute 
	private int height; //now it is internal attribute 
	public String materialOfBudy; //now it is internal attribute 
	public String getName(){ // created for getting information about name
		return name;
	}
	public String play(String useAir){ // use for realization process of playing
		abelePlay += useAir;
		return abelePlay;
	}
	public void setCountry(String newCountry){ // change country of producer
		countryOfProduce = newCountry;
		
	}
	public String group(){ // method refers tool for special group of instruments
		return groupOfInstrument;
	}
	private String register(){ // kind of register (high, low, middle)
		return kindOfRegister;
	}
	private void setColor(String addColor){ // set color of instrument
		color = addColor;
	}
	private int getWeight(){ // getting weight of instrument
		return weight;
	}
	private int getHeight(){ // getting height of instrument
		return height;
	}
	public void sings(){ // opportunity make sounds
	}
	private void setSize(int newWeight, int newHeight){ // getting total size, using new data of size
		size = newWeight + newHeight;
		
	}
}