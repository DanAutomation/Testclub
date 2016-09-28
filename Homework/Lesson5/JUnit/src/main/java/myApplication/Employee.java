package myApplication;

import java.sql.Statement;

public class Employee {

	public String name;
	public String surname;
	public int age;
	public String position;
	public String education;
	public String sex;
	public String department;
	public String chief;
	public int workingHours;
	public int yearBeginWork;
	public int yearEndWork;

	

	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public void setSurName(String surname){
		this.surname = surname;
	}
	
	public String getSurName(){
		return surname;
	}
	
	public String nameSurname(String name, String surname){
		return name + " " + surname;
	}
	
	public void setAge(int age){
		this.age = age;
	}
	
	public int getAge(){
		return age;
	}
	
	public void setDiploma(String education){
		this.education = education;
	}
	
	public void setSex(String sex){
		this.sex = sex;
	}
	
	public String getSex(){
		return sex;
	}
	
	public void setPosition(String position){
		this.position = position;
	}
	
	public String getPosition(){
		return position;
	}
	
	public void setYearBeginWork(int yearBeginWork){
		this.yearBeginWork = yearBeginWork;
	}
	
	public int getYearBeginWork(){
		return yearBeginWork;
	}
	
	public void setYearEndWork(int yearEndWork){
		this.yearEndWork = yearEndWork;
	}
	
	public int getYearEndWork(){
		return yearEndWork;
	}
	
	
	public int getExperience(int yearBeginWork, int yearEndWork){
		return yearEndWork - yearBeginWork;
	}
	
	public double getSalary(double salary, double bonus)
	{
	   return salary + bonus;
	}
	
	public String department(String department){
		return department;
	}
	
	public void nameOfChief(String chief){
		this.chief = chief;
	}
	
	public int getWorkingDay(){
		return workingHours;
	}
	
	public void setWorkingDay(int workingHours){
		this.workingHours = workingHours;
	}
	
	public static void main(String[] args){
//		Employee emp = new Employee();
//       emp.getAge(12);
//		emp.setAge(12);
//		System.out.println(emp.getAge());
	}

	

}
