package Lesson3;

public class PreIntermediate_1 {

	public boolean visitCinema(boolean heSmile, boolean sheSmile){
		if (heSmile == true && sheSmile == true){}
		return true;
	}
	public boolean notVisitCinema(boolean heSmile, boolean sheSmile){
		if (heSmile == true && sheSmile == false){
			return false;
		}
		else if(heSmile == false && sheSmile == true){
			return false;
		}
		else if(heSmile == false && sheSmile == false){}
		return false;
}
}
	
