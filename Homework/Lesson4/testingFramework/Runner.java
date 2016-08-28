package testingFramework;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

import jxl.write.WriteException;

public class Runner {

	static final String PATH_TO_INI = "D://projects//Test//src//testingFramework//tf.ini";
	
	
	String PATH_TO_EXCEL = "D://projects//Test//src//testingFramework//TestCases.xls"; 
	String DB_NAME = "com.mysql.jdbc.Driver";  // connection to database
	String DB_CONNECTION_STRING = "jdbc:mysql://localhost:3306/test";  // driver for connection
	String DB_USER = "root"; // login
	String DB_PASSWORD = "testclub";  // password
	String PATH_TO_SCRIPTS = "D://projects//Test//src//testingFramework//sripts.txt";
	String PATH_TO_REPORTS = "";
	
	
	public enum TestStatus {
	    PASSED, FAILED 
	}
	

	public void loadConfigurations() throws FileNotFoundException, IOException {
		EnvironmentSetup myEnvironment = new EnvironmentSetup();
		DB_NAME = myEnvironment.getFromIniFile("DB_NAME",  PATH_TO_INI);
		DB_CONNECTION_STRING = myEnvironment.getFromIniFile("DB_CONNECTION_STRING",  PATH_TO_INI);
		DB_USER = myEnvironment.getFromIniFile("DB_USER",  PATH_TO_INI);   
		DB_PASSWORD = myEnvironment.getFromIniFile("DB_PASSWORD",  PATH_TO_INI);
		
	}
	
	public void setUpEnvironment() throws FileNotFoundException, IOException, SQLException{
		String nameOfScripts = "";
		EnvironmentSetup myEnvironment = new EnvironmentSetup();
		PATH_TO_SCRIPTS = myEnvironment.getFromIniFile("",  PATH_TO_INI);
		myEnvironment.CreateDbTablesWithData(DB_CONNECTION_STRING, DB_USER, DB_PASSWORD, nameOfScripts, PATH_TO_SCRIPTS);
		
	}

	public void runTestCases() {
		TestRunner myTestRun = new TestRunner();
		myTestRun.loadTestCaseData(PATH_TO_EXCEL);
		myTestRun.showTestCaseData();
		myTestRun.executeTestCases();
		
	}
	
	public void generateTestReport() throws WriteException, IOException {
		Reporting myReport = new Reporting();
		myReport.generateHTMLreport(PATH_TO_REPORTS); 
		
	}
	
	public static void main(String[] args){
		
	}

}
