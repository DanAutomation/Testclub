package myApplication;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestRule;
import org.junit.rules.Timeout;

public class EmployeeTest1 extends Employee{



	Employee emp1 = new Employee();
	Employee emp2 = new Employee();

	   @Before
	   public void createObject() throws Exception {
		   Employee emp1 = new Employee();
		   System.out.println("Object of class EmployeeTest1 was created");
		   
	   }
	   
	   @Test
	   public void checkAge(){
		   assertNotNull(emp1.getAge());
	   }
	   
	
	   @Test
	   public void checkGetAge() {
		  int age = 27;
	      assertEquals(age, 27, emp1.getAge());
	      
	   }
	   
	   @Ignore
	   public void checkName(){
		   String name = "name";
		   assertEquals(name, emp1.getName());
	   }
	   
	   @Test
	   public void nameNotSurname(){
		   assertNotEquals(emp1.getName(), emp1.getSurName());
	   }
	   
	   @Test(timeout = 15000)
	   public void checkSex(){
		   assertTrue(emp1.getSex(), true);
	   }
	   
	   @Test
	   public void checkEqualsNameSurname(){
		   assertSame(emp1, emp1);
	   }
	   
	   @Test
	   public void checkYearsBegin(){
		   assertNotNull(emp1.getYearEndWork());
	   }
	   
	   @Test(timeout = 15000)
	   public void checkYearsEnd(){
		   assertNotNull(emp1.getYearBeginWork());
	   }
	   
	   @Test
	   public void checkExperience(){
		   assertTrue(emp1.getYearEndWork() > emp1.getYearBeginWork());
		   
	   }
	   
	   @Test
	   public void checkWorkingHours(){
		   int worHours = 9;
		   assertEquals(worHours, emp1.getWorkingDay());
	   }
	   
	   @Test
	   public void checkDiploma(){
		   assertTrue("high", true);
	   }
	   
	   @Test
	   public void checkNameSurname(){
		   String result = emp1.nameSurname("Vasya", "Hromko");
	        assertEquals("Vasya Hromko", result);
	   }
	   
	   @Rule
	   public TestRule timeout = new Timeout(15000);
	   
	   
	   @Test (timeout=1000)
	   public void checkSalary(){
	        double result = emp1.getSalary(1050.12, 187.5);
	        assertEquals(1087.14, 1237.62, result);
	   }
	   
	   
	   @Test (expected=NullPointerException.class)
	   public void checkMessage(){
		   fail("no message");
	   }
	   

	   @After 
	   public void finishClass(){
		   System.out.println("End of class");
	   }
	

}
