package FirstTable;

import java.io.FileInputStream;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Properties;

public class Table1 {
static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";   // driver for connection
static final String DB_URL = "jdbc:mysql://localhost:3306/test";  // connection to database
static final String USER = "root";  // login
static final String PASS = "testclub";  // password
java.sql.Connection myConn = null;  // create connection
String table = "D:/projects/Test/src/FirstTable/createTable"; // link to file, where store data for creation tables
String sql1;  // His Majesty sql-request 
public Table1(String sql1){  // constructor
       this.sql1 = sql1; 
}

public void getString(){ // run method getString 
try{
     Properties props = new Properties();  // create instance of class and input in var props of class Properties
     props.load(new FileInputStream("D:/projects/Test/src/Lesson4/ini_file"));  // load ini_file

     String theUser = props.getProperty("user");  // find in ini field user, for load file
     String thePassword = props.getProperty("password");  // find in ini field password, for load file
     String theDbUrl = props.getProperty("dburl");  // find in ini field dburl, for load link to file
     System.out.println("Connection to database...");  // information message
     System.out.println("Database url: " + theDbUrl);  // information message
     System.out.println("User: " + theUser);  // information message

     myConn = DriverManager.getConnection(theDbUrl, theUser, thePassword);  // connection to db, having information of link. login. password
     System.out.println("\nConnection successful!\n"); // information field
     props.load(new FileInputStream(table));    // load var with way for creation table
     String sql = props.getProperty("table");  // find in file var table with script for creation table
     String fillTable = props.getProperty("fillTable"); // fill table, using var with way

     // execute scripts
     PreparedStatement table1 = (PreparedStatement) myConn.prepareStatement(sql);  
     table1.executeUpdate(sql);
     PreparedStatement fillTab = (PreparedStatement) myConn.prepareStatement(fillTable);
     fillTab.executeUpdate(fillTable);
  
     Statement stmt = myConn.createStatement();    // create connection

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

public static void main(String[] args) throws SQLException{
    String sql1 = "SELECT * FROM Table1";  
    Table1 a = new Table1(sql1);  // instance of class
    a.getString();  // call the method of getString()
   }
		
		
		public static void printRs(ResultSet rs) throws SQLException{    // run method printRs
			ResultSetMetaData rsmd = rs.getMetaData();  // get rs and input in method getMetaData();
			int quontOfColumn = rsmd.getColumnCount();  // get quontity of columns
			ArrayList<String> arr = new ArrayList<String>();
			String a;   // initialize variable
			while(rs.next()){  // while cycle, check every value till end
		    
		    for(int i = 2; i <= quontOfColumn; i++){ // go through all colomns 
		    a = rs.getString(i) + ";";  // get values
		    System.out.print(a); //   output in console
		    
		    }
		   }//end printRs()
		  }//end JDBCExample  
		}
	