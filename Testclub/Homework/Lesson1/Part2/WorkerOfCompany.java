
public class WorkerOfCompany {
	private String position; //now it is internal attribute
	private String name; //now it is internal attribute
	private String surname; //now it is internal attribute
	private int years; //now it is internal attribute
	private int quonDiplomas; //now it is internal attribute
	private String sex; //now it is internal attribute
	private int expInYears; //now it is internal attribute
	private String hobby; //now it is internal attribute
	private boolean married; //now it is internal attribute
	private String persSkills; //now it is internal attribute
	
	public String getName(){ // method helps to getting name 
		return name;
	}
	public void setName(String newName){ //method helps to setting name 
		name = newName;
	}
	public String getPosition(){ // method helps to getting position
		return position;
	}
	public void setPosition(String newPosition){ //method helps to setting position
		position = newPosition;
	}
	public String getSurname(){ // method helps to setting surname 
		return surname;
	}
	public void setSurname(String newSurname){ // method helps to getting surname 
		surname = newSurname;
	}
	private int getYears(){ // method helps to getting years 
		return years;
	}
	private void setYears(String newYears){ // method helps to getting years 
		years = newYears;
	}
	private int getQuonDiplomas(){ // method helps to getting information about quantity of diplomas
		return quonDiplomas;
	}
	private void setQuonDiplomas(String newQuonDiplomas){ // method helps to setting quantity of diplomas
		surname = newQuonDiplomas;
	}
	public String getSex(){ // method helps to getting sex of worker
		return sex;
	}
	public void setSex(String newSex){ // method helps to setting sex of worker
		sex = newSex;
	}
	private String getExpInYears(){ // method helps to getting experience in years
		return expInYears;
	}
	private void setExpInYears(String newExpInYears){ // method helps to setting experience in years
		expInYears = newExpInYears;
	}
	public void setHobby(String newHobby){ // method helps set hobby
		hobby = newHobby;
	}
	public String getHobby(){ // method helps get hobby 
		return hobby;
	}
	public void setMarried(String newMarried){ //method helps set status of merried
		married = newMarried;
	}
	public boolean getMarried(){ //method helps get status of merried
		return married;
	}
	public void setPersSkills(String newPersSkills){ //method helps set personall skills
		persSkills = newPersSkills;
	}
	public boolean getpersSkills(){ //method helps get personal skills
		return perSkills;
	}
	
	
	
	
	
	
	

}