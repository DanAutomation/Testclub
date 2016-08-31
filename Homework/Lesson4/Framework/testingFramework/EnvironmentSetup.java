package testingFramework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;


public class EnvironmentSetup {
	
    Properties props = new Properties();
    java.sql.Connection myConn;
    

	public void CreateDbTablesWithData(String DB_USER, String DB_CONNECTION_STRING, String DB_PASSWORD, String nameOfScriptInFile, String PATH_TO_SCRIPTS) throws SQLException, FileNotFoundException, IOException {
		// законнектитьс€ к базе использу€ путь
		// использу€ скрипты из файла выполнить каждый из них
		
		
		myConn = DriverManager.getConnection(DB_CONNECTION_STRING, DB_USER, DB_PASSWORD);
		props.load(new FileInputStream(PATH_TO_SCRIPTS));
		java.sql.PreparedStatement table = myConn.prepareStatement(nameOfScriptInFile);  
	    table.executeUpdate(nameOfScriptInFile);
		System.out.println("\nConnection successful!\n"); // information field
		
	}

	public String getFromIniFile(String string, String pathToIni) throws FileNotFoundException, IOException {
		String parametrValue = "";
		//открыть файл по адресу pathToIni
		// найти строку, котора€ начинаетс€ со —тринг
		// DB_NAME = testclub
		props.load(new FileInputStream(pathToIni)); 
		parametrValue = props.getProperty(string);
		
		return parametrValue;
	}


}