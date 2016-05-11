
public class WorkerOfCompany {
	public String position; //now it is internal attribute
	public String name; //now it is internal attribute
	public String surname; //now it is internal attribute
	private int years; //now it is internal attribute
	private int quonDiplomas; //now it is internal attribute
	public String sex; //now it is internal attribute
	private int expInYears; //now it is internal attribute
	private String hobby; //now it is internal attribute
	private boolean married; //now it is internal attribute
	public String persSkills; //now it is internal attribute
	public String getName(){ // method getting name 
		return name;
	}
	public String getSurname(){ //  method getting name 
		return surname;
	}
	public String getPosition(){ // method getting position
		return position;
	}
	public void work(){ // method provide insight what person do in working time
	}
	public void count(){ // method provide insight what person counting during working time
	}
	public void sale(){ // method provide insight what person sale during working time
	}
	public void build(){ // method provide insight what person building during working time
	}
	public void sleep(){ // did person sleep in working time
	}
	private int howOld(){ // to know about age
		return years;
	}
	private void setDiplomas(int newDiplom){ // method adding quantity of diplomas
		quonDiplomas += newDiplom;
	}
	public String getSex(){ // certain method can identification gender
		return sex;
	}
	private int getExperience(){ // method realized for information about experience
		return expInYears;
	}
	private boolean getStatus(boolean foundLove){ // method provide insight about material status
		return married;
	}
	public String getSkills(){ // methods gives knowledge about skills worker
		return persSkills;
	}
	public String gethobby(){ // demonstrate knowledge of hobby
		return hobby;
	}

}