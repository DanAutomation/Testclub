package Testclub;

public class Year {
	private String nameOfYear; //now it is internal attribute
	private int numQuorter; //now it is internal attribute
	private String nameSeason; //now it is internal attribute
	private int numMonth; //now it is internal attribute
	private int numWeek; //now it is internal attribute
	private int numDay; //now it is internal attribute
	private int numHour; //now it is internal attribute
	private int numMin; //now it is internal attribute
	private int numSec; //now it is internal attribute
	private int millSec; //now it is internal attribute
	public String getNameOfYear(){  // get name of year
		return nameOfYear; 
	}
	public void nameOfYear(String newName){  // set name of year
		nameOfYear = newName; 
	}
	public void setQuorter(int addQuorter){ // set Quarter
		numQuorter = addQuorter;
	}
	public int getQuortner(){ // get Quarter
		return numQuorter;
	}
	public String getNameSeason(){ // get name of season
		return nameSeason;
	}
	public void setNameSeason(String NewNameSeason){ // set name of year
		season = nameSeason;
	}
	public int getNumMonth(){ // get number of month
		return numMonth;
	}
	public void setNumMonth(int numMonth1){ // set number of month
		numMonth = numMonth1;
	}
	public int getNumWeek(){ // get number of week
		return numWeek;
	}
	public void setNumWeek(int numWeek){ // set number of week
		numWeek = numWeek;
	}
	public int getNumDay(){ // get number of day
		return numDay;
	}
	public void setNumDay(int numDay){ // set number of dayr
		numDay = numDay;
	}
	public int getNumHour(){ // get number of hour
		return numHour;
	}
	public void setNumHour(int numHour){ // set number of hour
		numHour = numHour;
	}
	public int getNumMin(){ // get minutes
		return numMin;
	}
	public void setNumMin(int numMin){ // set minutes
		numMin = numMin;
	}
	public int getNumSec(){ // get seconds
		return numSec;
	}
	public void setNumSec(int numSec){ // set seconds
		numSec = numSec;
	}
	public int getNumMillsec(){ // get milliseconds
		return numMillsec;
	}
	public void setNumMillsec(int numMillSec){ // get milliseconds
		millSec = nemMillSec;
	}
	
	
	
		
	
	
	
	
	

}


/*
Class "Year":
Attributes: name year, number of quarter, name of season (summer, autumn, winter, spring), 
number of month, number of week(1-4), number of day, number of hour, number of minute, 
number of second, number of millisecond 
states:  
bissextile, non-bissextile, thankfull, helpfull, 
favorable, non-favorable, cold, hot, perspective, difficult
Methods:
change season, change month, change minute, change day, 
change night, change second, change milisecond,
change hour, change world, change people 
*/