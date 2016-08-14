package Lesson4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Properties;

import com.mysql.jdbc.Connection;

import OnDel.Result;
import jxl.read.biff.BiffException;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class Runner {

	public static void main(String[] args) throws SQLException, java.lang.NullPointerException, FileNotFoundException, IOException, RowsExceededException, WriteException, BiffException {
		/*
		- база данных - путь, логин, пароль
		- скрипты для создания с нуля таблиц с данными в базе данных - путь  к файлу
		- имя и путь к файлу с тест кейсами
		- имя и путь к файлу, куда нужно записывать отчеты

		Реализация - final String переменная с полным путем к ini файлу со всей этой информацией

		Инициализация атрибутов класса Runner происходит следующим образом:
		Значение конкретного атрибута вычитывается из ini файла.
		Требуется Error Handling (нет атрибута, пустое значение, закомментированное значение)

*/

		
		
		java.sql.Connection myConn = null;
		Statement myStmt = null;
		ResultSet myRes = null;
		try{
			// Load properties file
			Properties props = new Properties();
			props.load(new FileInputStream("D:/projects/Test/src/Lesson4/ini_file"));
			//props.load(new FileInputStream("Config.properties"));
			
			String theUser = props.getProperty("user");
			String thePassword = props.getProperty("password");
			String theDbUrl = props.getProperty("dburl");
			
			System.out.println("Connection to database...");
			System.out.println("Database url: " + theDbUrl);
			System.out.println("User: " + theUser);
			
			myConn = DriverManager.getConnection(theDbUrl, theUser, thePassword);
			
			System.out.println("\nConnection successful!\n");
			


		props.load(new FileInputStream("D:/projects/Test/src/Lesson4/createTables"));
		
		String airlines = props.getProperty("airlines");
		String airports = props.getProperty("airports");
		String flights = props.getProperty("flights");
		
		
		PreparedStatement tableAirlines = (PreparedStatement) myConn.prepareStatement(airlines);
		tableAirlines.executeUpdate(airlines);
		PreparedStatement tableAirports = (PreparedStatement) myConn.prepareStatement(airports);
		tableAirports.executeUpdate(airports);
		PreparedStatement tableFlights = (PreparedStatement) myConn.prepareStatement(flights);
		tableFlights.executeUpdate(flights);
		
		props.load(new FileInputStream("D:/projects/Test/src/Lesson4/fillTables"));
		
		String fillflights = props.getProperty("fillFlights");
		String fillAirports = props.getProperty("fillAirports");
		String fillAirlines = props.getProperty("fillAirlines");
		
		
		PreparedStatement fl = (PreparedStatement) myConn.prepareStatement(fillflights);
		fl.executeUpdate(fillflights);
		PreparedStatement air = (PreparedStatement) myConn.prepareStatement(fillAirports);
		air.executeUpdate(fillAirports);
		PreparedStatement airl = (PreparedStatement) myConn.prepareStatement(fillAirlines);
		airl.executeUpdate(fillAirlines);
		System.out.println("tables were created");
		
		
		TestReport a = new TestReport();
		a.createReportWithHeader();
		ExecutedTestCase b = new ExecutedTestCase(fillflights, fillAirports, fillAirlines);
		b.getActualResult();
		b.generateStringFromResultSet();
		
		

		}
		catch(SQLException e){
			System.out.println("check");
		}
	}
}
