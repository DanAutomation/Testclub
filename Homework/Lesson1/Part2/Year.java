package Testclub;

public class Year {
	public String nameOfYear; //now it is internal attribute
	public int numQuorter; //now it is internal attribute
	public String nameSeason; //now it is internal attribute
	private int numMonth; //now it is internal attribute
	private int numWeek; //now it is internal attribute
	private int numDay; //now it is internal attribute
	public int numHour; //now it is internal attribute
	public int numMin; //now it is internal attribute
	private int numSec; //now it is internal attribute
	private int millSec; //now it is internal attribute
	public String nameOfYear(){  // for identification of name
		return nameOfYear; 
	}
	public void Quorter(int addQuorter){ // method use opportunity add quarter of year
		numQuorter += addQuorter;
	}
	public String identName(){ // for identification of name
		return nameSeason;
	}
	public void addMonth(int newMonth){ // for adding new month
		numMonth = newMonth;
	}
	public void addDay(int newDay){ // for adding new day
		numDay = newDay;
	}
	public void addHour(int newHour){ // for adding new hour
		numHour = newHour;
	}
	public int getMin(){ // for identification minute
		return numMin;
	}
	public int getMiliseconds(){ // for identification millisecond
		return millSec;
	}
	public int getSeconds(){ // for identification second
		return millSec;
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