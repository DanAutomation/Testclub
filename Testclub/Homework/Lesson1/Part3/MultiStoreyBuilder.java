

public abstract class MultiStoreyBuilder extends LivingBuilder {
	String serviceLift; //now it is internal attribute
	String passengerLift; //now it is internal attribute
	String garbageChute; //now it is internal attribute
	int numberOfStorey; //now it is internal attribute
	
	abstract void upOnLift(); // method was realized to up on lift

	abstract void downOnLift(); // method was realized to down on lift
	

}
