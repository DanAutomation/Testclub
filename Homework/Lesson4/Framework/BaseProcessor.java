package Lesson4.Framework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Properties;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.ResultSetMetaData;
import com.mysql.jdbc.Statement;

import jxl.Workbook;
import jxl.format.Alignment;
import jxl.format.Border;
import jxl.format.BorderLineStyle;
import jxl.format.Colour;
import jxl.write.Label;
import jxl.write.WritableCellFormat;
import jxl.write.WritableFont;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;

public class BaseProcessor implements Processor{
	
	public static void main(String args[]) throws FileNotFoundException, IOException, SQLException, WriteException{
		
		BaseProcessor a = new BaseProcessor();/*
		a.getConnection();
		a.createTableAirports();
		a.createTableAirline();
		a.createTableFlights();
		a.fillAirlinesTable();
		a.fillAirportsTablse();
		a.fillFlightsTable();
		*/
//		a.generateReport();
		a.getConnection();
		a.executeAllTest(sql1);
	}
    
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";   // driver for connection
    static final String DB_URL = "jdbc:mysql://localhost:3306/test";  // connection to database
    static final String USER = "root";  // login
    static final String PASS = "testclub";  // password
    static java.sql.Connection myConn = null;  // create connection
    static String tables = "D:/projects/Test/src/Lesson4/Framework/tables"; // link to file, where store data for creation tables
    static String sql1;  // His Majesty sql-request 
    
    
    static Properties props = new Properties();
    WritableWorkbook myWorkbook;

 
    
    public void getConnection() throws FileNotFoundException, IOException, SQLException{
		 myConn = DriverManager.getConnection(DB_URL, USER, PASS);  // connection to db, having information of link. login. password
	     System.out.println("\nConnection successful!\n"); // information field
    }
	


	public void createTableAirline() throws FileNotFoundException, IOException, SQLException {
   // load var with way for creation table
	    props.load(new FileInputStream(tables)); 
		String sql = props.getProperty("airlines");  // find in file var table with script for creation table
		PreparedStatement table1 = (PreparedStatement) myConn.prepareStatement(sql);  
	    table1.executeUpdate(sql);
	    System.out.println("table Airlines was created");
		
	}

	
	public void createTableAirports() throws FileNotFoundException, IOException, SQLException {
	    props.load(new FileInputStream(tables)); 
		String sql = props.getProperty("airports");  // find in file var table with script for creation table
		PreparedStatement table1 = (PreparedStatement) myConn.prepareStatement(sql);  
	    table1.executeUpdate(sql);
	    System.out.println("table Airports was created");
		
	}

	
	public void createTableFlights() throws FileNotFoundException, IOException, SQLException {
	    props.load(new FileInputStream(tables)); 
		String sql = props.getProperty("flights");  // find in file var table with script for creation table
		PreparedStatement table1 = (PreparedStatement) myConn.prepareStatement(sql);  
	    table1.executeUpdate(sql);
	    System.out.println("table Flights was created");
		
	}

	
	public void fillAirlinesTable() throws FileNotFoundException, IOException, SQLException {
	    props.load(new FileInputStream(tables)); 
		String sql = props.getProperty("fillAirlines");  // find in file var table with script for creation table
		PreparedStatement table1 = (PreparedStatement) myConn.prepareStatement(sql);  
	    table1.executeUpdate(sql);
	    System.out.println("table Airlines has been filled");
		
	}

	
	public void fillAirportsTablse() throws FileNotFoundException, IOException, SQLException {
	    props.load(new FileInputStream(tables)); 
		String sql = props.getProperty("fillAirports");  // find in file var table with script for creation table
		PreparedStatement table1 = (PreparedStatement) myConn.prepareStatement(sql);  
	    table1.executeUpdate(sql);
	    System.out.println("table Airports has been filled");
		
	}

	
	public void fillFlightsTable() throws FileNotFoundException, IOException, SQLException {
	    props.load(new FileInputStream(tables)); 
		String sql = props.getProperty("fillFlights");  // find in file var table with script for creation table
		PreparedStatement table1 = (PreparedStatement) myConn.prepareStatement(sql);  
	    table1.executeUpdate(sql);
	    System.out.println("table Flights has been filled");
		
	}
	
	public void generateReport() throws WriteException, IOException {
		
		// creation of report
		myWorkbook= Workbook.createWorkbook(new File("D:\\checklist.xls"));
	    WritableSheet mySheet1 = myWorkbook.createSheet("Simple scenarios", 0);
	    WritableSheet mySheet2 = myWorkbook.createSheet("Complex scenarios", 1);
	    WritableFont cellFormat1 = new WritableFont(WritableFont.TIMES, 14);
	    WritableCellFormat cellFormat = new WritableCellFormat(cellFormat1);
	    cellFormat.setBorder(Border.ALL, BorderLineStyle.THICK);
	    cellFormat.setLocked(false);
	    cellFormat.setAlignment(Alignment.CENTRE);
	    
	    // create cells, width
	    int col = 1;
	    int widthInChars = 107;
	    mySheet1.setColumnView(col, widthInChars);
	    mySheet2.setColumnView(col, widthInChars);
	    mySheet1.addCell(new Label(col, 1, "A", cellFormat)); 
	    mySheet2.addCell(new Label(col, 1, "B", cellFormat));

	    
	    // create headers for sheet Simple Scenarios
	 	mySheet1.addCell(new Label(0, 0, "Number", cellFormat));
	    mySheet1.addCell(new Label(1, 0, "Test case name", cellFormat));
	    mySheet1.addCell(new Label(2, 0, "Result", cellFormat));
	    
	 // create headers for sheet Complex Scenarios
	    mySheet2.addCell(new Label(0, 0, "Number", cellFormat));
	    mySheet2.addCell(new Label(1, 0, "Test case name", cellFormat));
	    mySheet2.addCell(new Label(2, 0, "Result", cellFormat));
	    
	 
	        // create and get numeric numbers for sheet2
		    for(int j = 1; j<13; j++){
				Label label = new Label(0, j, "" + j, cellFormat);
				mySheet1.addCell(label);
			}
		    
		    // create and get numeric numbers for sheet2
		    for(int k = 1; k<6; k++){
		    	Label label_13 = new Label(0, k, "" + k, cellFormat);
			 	mySheet2.addCell(label_13);
		    }
	 		
		 // create names of fields for report
	 		mySheet1.addCell(new Label(1, 1, "Check all airports", cellFormat));
	 		mySheet1.addCell(new Label(1, 2, "Check flight numbers", cellFormat));
	 		mySheet1.addCell(new Label(1, 3, "Check unic airlines", cellFormat));
	 		mySheet1.addCell(new Label(1, 4, "Check airports with duty free", cellFormat));
	 	 	mySheet1.addCell(new Label(1, 5, "Check airports without priority boarding", cellFormat));
	 	 	mySheet1.addCell(new Label(1, 6, "Check all flight number from London", cellFormat)); 
	 		mySheet1.addCell(new Label(1, 7, "Check all from Prague to Kiev", cellFormat));
	 	 	mySheet1.addCell(new Label(1, 8, "Check flight numbers from New York to Helsinki witch coast more then 100", cellFormat));	
	 	 	mySheet1.addCell(new Label(1, 9, "Check airlines without web registration", cellFormat));
	 	 	mySheet1.addCell(new Label(1, 10, "Check flightNumber from Virgin and meal is included", cellFormat)); 
	 	 	mySheet1.addCell(new Label(1, 11, "Check flightNumber where airline WizzAir, meal included, is additional space service and exist web registration", cellFormat));
	 	 	mySheet1.addCell(new Label(1, 12, "Check flights from London without duty free", cellFormat)); 
	 	 	mySheet2.addCell(new Label(1, 1, "Check all airlines from Beijing to Helsinki", cellFormat));
	 	 	mySheet2.addCell(new Label(1, 2, "Check all arrival airports from Kiev with web registration and duty free", cellFormat));
	 	 	mySheet2.addCell(new Label(1, 3, "story 1", cellFormat));
            mySheet2.addCell(new Label(1, 4, "story 2", cellFormat));
	 	 	mySheet2.addCell(new Label(1, 5, "story 3", cellFormat));

		System.out.println("report was created");
	
    myWorkbook.write();
    myWorkbook.close();
}

	
	public void executeAllTest(String sql1) {
    

		try{

		     Statement stmt = (Statement) myConn.createStatement();    // create connection

		     
		     ResultSet rs = stmt.executeQuery(sql1);  // execute query
		     rs.beforeFirst();  // method set cursor to before first record

		     // ResultSetMetaData rsmd = rs.getMetaData();  // create result 
		     printRs(rs);  // input result in method printRs()
		    stmt.close();   // close process
		    myConn.close();  // close connection


		}catch(SQLException se){
		    //Handle errors for JDBC
		    se.printStackTrace();
		}catch(Exception e){
		    //Handle errors for Class.forName
		    e.printStackTrace();
		}finally{
		    //finally block used to close resources
		    try{
		       if(myConn!=null)
		       myConn.close();
		    }catch(SQLException se){
		       se.printStackTrace();
		    }//end finally try
		  }//end try
		}//end main

//		public static void main(String[] args) throws SQLException{
//		    String sql1 = "SELECT * FROM Table1";  
//		    Test3 a = new Test3(sql1);  // instance of class
//		    a.getString();  // call the method of getString()
//		   }
				
				
	public static ArrayList<java.lang.String> printRs(ResultSet rs) throws SQLException{    // run method printRs
		java.sql.ResultSetMetaData rsmd = rs.getMetaData();  // get rs and input in method getMetaData();
		int quontOfColumn = rsmd.getColumnCount();  // get quontity of columns
		ArrayList<String> req = new ArrayList<String>();
		while(rs.next()){  // while cycle, check every value till end
	    
	    for(int i = 2; i <= quontOfColumn; i++){ // go through all colomns 
	    	  // get values
	     //   output in console

	             System.out.println(req.add(rs.getString(i) + ","));
	    }
	    
	   }//end printRs()
		return req;
	  }//end JDBCExample  
	}



	



