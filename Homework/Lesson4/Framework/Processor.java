package Lesson4.Framework;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

import jxl.write.WriteException;

public interface Processor {
	
	public void createTableAirline() throws FileNotFoundException, IOException, SQLException;
	
	public void createTableAirports() throws FileNotFoundException, IOException, SQLException;
	
	public void createTableFlights() throws FileNotFoundException, IOException, SQLException;
	
	public void fillAirlinesTable() throws FileNotFoundException, IOException, SQLException;
	
	public void fillAirportsTablse() throws FileNotFoundException, IOException, SQLException;
	
	public void fillFlightsTable() throws FileNotFoundException, IOException, SQLException;
	
	public void executeAllTest(String sql1);
	
	public void generateReport() throws WriteException, IOException;

}
