package Lesson4.testingFramework;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class RunSQL {

	private String dbConnectionName = "";  // driver for connection
	private String dbUser = ""; // login
	private String dbPassword = "";  // password
	private String query = "";

public RunSQL (String dbConnectionName,  String dbUser, String dbPassword, String myQuery){
	
	this.query = query;
	this.dbConnectionName = dbConnectionName;  // driver for connection
	this.dbUser = dbUser; // login
	this.dbPassword = dbPassword;  // password
	
}

public String getResultToString() {
    String convertedResult = "";
	//-----------
    
    try (
	         // Step 1: Allocate a database "Connection" object
	         Connection conn = DriverManager.getConnection(
	        		 dbConnectionName, dbUser, dbPassword); // MySQL
	 
	         // Step 2: Allocate a "Statement" object in the Connection
	         Statement stmt = conn.createStatement();
	      ) {
	         // Step 3: Execute a SQL SELECT query, the query result
	        //  is returned in a "ResultSet" object.
	    			
					ResultSet rs = stmt.executeQuery(query);
					ResultSetMetaData rsmd = rs.getMetaData();  // get rs and input in method getMetaData();
					int quontOfColumn = rsmd.getColumnCount();  // get quontity of columns
					ArrayList<String> arr = new ArrayList<String>();
					String result;   // initialize variable
					//Теперь пора поработать с ResultSet
					while (rs.next()) {
//Из запроса нужно извлечь имя поля, которое мы будем искать в ResultSet
						//Сделать это нужно через substring 
						//Ищем, какой номер позиции int startPosition у фразы " FROM " в строке
						//Через substring забираем начало до слова " FROM "
						//Ищем пробел, начиная с конца откушенной фразы 
						//Как только нашли номер позиции int endPosition - substring!!! 
						  for(int i = 2; i <= quontOfColumn; i++){ // go through all colomns 
							    result = rs.getString(i) + ";";  // get values
/*
 public String delDel(String str) {
 if (str.length()>=4 && str.substring(1, 4).equals("del")) {
    // First char + rest of string starting at 4
    return str.substring(0, 1) + str.substring(4);
  }
  // Otherwise return the original string.
  return str;
}
 */
							    String from = " FROM ";
							    int end = query.indexOf(from);
							    String nameSqlQuerry = query.substring(6, end);
//							    String nameSqlQuerry = query.substring(0, 6);
//							    String a = query.substring(nameSqlQuerry.length(), "from");
//							    


							    	

//							
							int name = query.length();
							    }
							    /*
						String userid = rs.getString("USER_ID");
						String username = rs.getString("USERNAME");

						System.out.println("userid : " + userid);
						System.out.println("username : " + username);
*/
					}
					
					
					//
					
//					}

		  } catch (SQLException ex) {
	         ex.printStackTrace();
	      }
    
    //-----------
	return convertedResult;
}

	
}
