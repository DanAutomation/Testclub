

public abstract class LivingBuilder extends Builder
{
	String stairs; //now it is internal attribute
	int windows; //now it is internal attribute
	boolean electricity; //now it is internal attribute
	int flats; //now it is internal attribute
	String heating; //now it is internal attribute
	
	abstract boolean getSwitch(); // method realized to get electricity

	abstract String getHeating(); // method realized to get heating
	
	abstract void openCrane(); // method turn on crane with water

}
