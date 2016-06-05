package Lesson3;

public class PreIntermediate_1 {

	public boolean visitCinema(boolean heSmile, boolean sheSmile){ // method is implemented going to the cinema, when both are happy
		if (heSmile == true && sheSmile == true){} // are both ready to go?
		return true; // go-go-go!
	}
	public boolean notVisitCinema(boolean heSmile, boolean sheSmile){ // unlucky attempt to go to the cinema
		if (heSmile == true && sheSmile == false){ // she isn't ready
			return false; // result 
		}
		else if(heSmile == false && sheSmile == true){ // he isn't ready
			return false; //result
		}
		else if(heSmile == false && sheSmile == false){} // he and she aren't ready to go
		return false; // result
}
}
	
