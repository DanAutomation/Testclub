package Lesson1;

public class Entertainment {
	public String entertainmentName; //now it is internal attribute
	public String typeOfEntertainment; //now it is internal attribute
	public boolean people; //now it is internal attribute
	public boolean animals; //now it is internal attribute
	private String inventary; //now it is internal attribute
	private double money; //now it is internal attribute
	private double time; //now it is internal attribute
	public String area; //now it is internal attribute
	private boolean device; //now it is internal attribute
	private boolean internet; //now it is internal attribute
	
	public String inputName(String newEntertainmentName){ // ability change name of entertainment 
		entertainmentName = newEntertainmentName;
		return entertainmentName;
	}
	public String typeOfEntertainment(){ // here we can get type of entertainment
		return typeOfEntertainment;
	}
	public boolean willPeople(){ // get information about existence people on entertainment
		return people;
	}
	public boolean willAnimals(){ // get information about existence animals on entertainment
		return animals;
	}
	private String getInventary(){ // how will participate inventary in entertainment
		return inventary;
	}
	private double howManyMoney(double money){ // this method determine participation money in entertainment
		return money;
	}
	public void getArea(String chosenAres){ // this method can choose area for entertainment
		area = chosenAres;
	}
	public boolean shouldHaveDevice(){ // use device for callback particpators or no?
		return device;
	}
	private boolean withInternet(){ // use internet for research place, inventary and orther attributes
		return internet;
	}
	private void setTime(double minutes, double seconds, double hours){ // abbility set time in year
		time = minutes + seconds + hours;
	}	
}