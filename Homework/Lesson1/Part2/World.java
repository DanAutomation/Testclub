public class World {
	public String sunSystem; //now it is internal attribute
	public String plannet; //now it is internal attribute
	private String hemysphere; //now it is internal attribute
	private String continent; //now it is internal attribute
	private String climateZone; //now it is internal attribute
	public String countryName; //now it is internal attribute
	public String city; //now it is internal attribute
	public String region; //now it is internal attribute
	public String village; //now it is internal attribute
	public String house; //now it is internal attribute
	public String identSunSystem(){ // method was realized for identification sun system
		return sunSystem;
	}
	public void addPlannet(String newPlannet){ // method adding new planet
		plannet = newPlannet;
	}
	private String hemysphere(){ // identification north or south hemysphere
		return hemysphere;
	}
	private String partOfLand(){ // identification continent 
		return continent;
	}
	private void climateZone(){ // method realized for definition climate zone
	}
	public void setRenameCountry(String newCountry){ // for change name country
		countryName = newCountry;
	}
	public String city(){ // getting city
		return city;
	}
	public String region(){ // getting city
		return region;
	}
	public String village(){ // // getting village
		return village;
	}
	public void changeHouse(String newHouse){ // opportunity add new house
		house = newHouse;
	}
}