package Lesson4.Framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Properties;

import jxl.write.WriteException;

public class Runner {

	public static void main(String[] args) throws FileNotFoundException, IOException, SQLException, WriteException {
		Properties props = new Properties();
		
		String response="D:/projects/Test/src/Lesson4/Framework/response";
		String sqlQueries = "D:/projects/Test/src/Lesson4/Framework/sqlQueries";
		
		
		BaseProcessor a = new BaseProcessor();
		BaseTest b = new BaseTest();
		
		
		a.getConnection();
		a.createTableAirports();
		a.createTableAirline();
		a.createTableFlights();
		a.fillAirlinesTable();
		a.fillAirportsTablse();
		a.fillFlightsTable();		
		a.generateReport();
		
		props.load(new FileInputStream(sqlQueries)); 
		String sql1 = props.getProperty("sql1");  // find in file var table with script for creation table
		String sql2 = props.getProperty("sql2");
		String sql3 = props.getProperty("sql3");
		String sql4 = props.getProperty("sql4");
		String sql5 = props.getProperty("sql5");
		String sql6 = props.getProperty("sql6");
		String sql7 = props.getProperty("sql7");
		String sql8 = props.getProperty("sql8");
		String sql9 = props.getProperty("sql9");
		String sql10 = props.getProperty("sql10");
		String sql11 = props.getProperty("sql11");
		String sql12 = props.getProperty("sql12");
		String sql13 = props.getProperty("sql13");
		String sql14 = props.getProperty("sql14");
		String sql15 = props.getProperty("sql15");
		String sql16 = props.getProperty("sql16");
		String sql17 = props.getProperty("sql17");
		
		String resp = props.getProperty("response");
		
		b.compareWithExpectedResultComplexScenarios(sql1, response);
		
		a.executeAllTest(sql1);
		a.executeAllTest(sql2);
		a.executeAllTest(sql3);
		a.executeAllTest(sql4);
		a.executeAllTest(sql5);
		a.executeAllTest(sql6);
		a.executeAllTest(sql7);
		a.executeAllTest(sql8);
		a.executeAllTest(sql9);
		a.executeAllTest(sql10);
		a.executeAllTest(sql11);
		a.executeAllTest(sql12);
		a.executeAllTest(sql13);
		a.executeAllTest(sql14);
		a.executeAllTest(sql15);
		a.executeAllTest(sql16);
		a.executeAllTest(sql17);


		

		

	}

}
