package MyApplication;

public class Employee {
	public String name;
	public String surname;
	public int age;
	public String position;
	public String education;
	public String sex;
	public String department;
	public String chief;
	double salary; 
	double bonus;
	public int workingHours;
	public int yearBeginWork;
	public int yearEndWork;

	
	public String getName(String name){
		return name;
	}
	
	
	public String getSurName(String name){
		return surname;
	}
	
	public String nameSurname(String name, String surname){
		return name + " " + surname;
	}
	
	public int getAge(int age){
		return age;
	}
	
	public String getDiploma(String education){
		return education;
	}
	
	public String getSex(String sex){
		return sex;
	}
	
	public String getPosition(String position){
		return position;
	}
	
	public int getExperience(int yearBeginWork, int yearEndWork){
		return yearEndWork - yearBeginWork;
	}
	
	public double getSalary(double salary, double bonus)
	{
	   return salary + bonus;
	}
	
	public String getDepartment(String department){
		return department;
	}
	
	public String getNameOfChief(String chief){
		return chief;
	}
	
	public int getWorkingMonth(int workingHours){
		return workingHours * 22;
	}
	
	public int getWorkingYear(int workingHours){
		return workingHours * 22 * 12;
	}


}