package MyApplication;

//import static org.junit.Assert.assertNotNull;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

//import myApplication.Employee;
// provide groups, dependencies between tests, organize several test suites

public class NewTest {
	
	 Employee emp = new Employee();
	 
	 @BeforeClass//(timeOut = 1000)
	 public void setUp() {
		 System.out.println("Class for using TestNG was created");
		 Employee emp = new Employee();
	 }
	 
	 @Test(groups={"functional"})
	 public void checkName(){
		 System.out.println("this method check correctness of name");
		 Assert.assertTrue(emp.getName("name") != "other name" , "correct");
	 }
	 
	 @Test(groups={"functional"})
	 public void checkSurname(){
		 System.out.println("this method check correctness of surname");
		 Assert.assertFalse(emp.getSurName("Petrov") == "Sidorov", "wrong");
	 }
	 
	 @Test(groups={"smoke"},dependsOnMethods={"checkName", "checkSurname"})
	 public void checkNameSurname(){
		 System.out.println("this method check coreectness of name and surname");
		 Assert.assertEquals(emp.nameSurname("Sergey","Ivanov"),"Sergey Ivanov");
	 }
	 
	 @AfterGroups
	    public void checkAge(){
		 System.out.println("this method check age of employee");
		 Assert.assertEquals(emp.getAge(36), 36);
	 }
	 
	 @Test(enabled = false)
	    public void ignoredMethod() {
	        System.out.println("this method will be ignored!");
	    }
	 
	 @Test(timeOut = 1000)
	 public void checkExperience(){
		 System.out.println("method check correct experience");
			  Assert.assertEquals(emp.getExperience(2014,2016), 2);
	 }
	 
	 @AfterMethod(timeOut = 1000)
	 public void checkDiplon(){
		 System.out.println("this method check diplom");
		 Assert.assertFalse(emp.getDiploma(null) =="high", "ok!");
	 }
	 
	 @Test
	 public void checkSalary(){
		 System.out.println("this method check salary of employee");
		 Assert.assertEquals(emp.getSalary(350.00, 150.50), 500.50);
	 }
	 
	 @Test
	 public void checkPosition(){
		 System.out.println("method verify position");
		 Assert.assertFalse(emp.getPosition("general director") == "sales manager", "false");
	 }
	 
	 @Test(dependsOnMethods = {"checkPosition"})
	 public void getWorkingMonth(){
		 Assert.assertEquals(emp.getWorkingMonth(8), 176, "get hours in the year");
	 }

	 @Test(dependsOnMethods = {"checkPosition"})
	 public void getWorkingYear(){
		Assert.assertEquals(emp.getWorkingYear(8), 2112, "get hours in the year"); 
	 }
	 
	    
	 @Parameters("sex")
	 @Test(timeOut = 1000)
	   public void getSex(String sex) {
	      System.out.println("parameter is: " + sex);
	   }
	 
	 @AfterClass
	 public void endOfTesting() {
		 System.out.println("End of using TestNG");
	 }	 
}