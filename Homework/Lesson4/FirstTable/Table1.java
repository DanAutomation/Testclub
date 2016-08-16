package FirstTable;



import java.io.FileInputStream;
//STEP 1. Import required packages
import java.sql.*;
import java.util.Properties;

public class Table1 {
	
	
 // JDBC driver name and database URL
 static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
 static final String DB_URL = "jdbc:mysql://localhost:3306/test";

 //  Database credentials
 static final String USER = "root";
 static final String PASS = "testclub";
 
public static void main(String[] args) throws SQLException{
	
	
	Table1 a = new Table1();
	a.getString();
}

public void getString(){
    
	
	java.sql.Connection myConn = null;

	
    
    
    
//    a.printRs(rs);
 try{

    Class.forName("com.mysql.jdbc.Driver");

    
    Properties props = new Properties();
	props.load(new FileInputStream("D:/projects/Test/src/Lesson4/ini_file"));
	
	String theUser = props.getProperty("user");
	String thePassword = props.getProperty("password");
	String theDbUrl = props.getProperty("dburl");
	
	System.out.println("Connection to database...");
	System.out.println("Database url: " + theDbUrl);
	System.out.println("User: " + theUser);
	
	myConn = DriverManager.getConnection(theDbUrl, theUser, thePassword);
	
	System.out.println("\nConnection successful!\n");

    String table = "D:/projects/Test/src/FirstTable/createTable";  
	
    props.load(new FileInputStream(table));
    
	String sql = props.getProperty("table");
	String fillTable = props.getProperty("fillTable");
	
	PreparedStatement table1 = (PreparedStatement) myConn.prepareStatement(sql);
	table1.executeUpdate(sql);
	
	PreparedStatement fillTab = (PreparedStatement) myConn.prepareStatement(fillTable);
	fillTab.executeUpdate(fillTable);
	


	
	
	Statement stmt = myConn.createStatement();    
	
	
    String sql1 = "SELECT * FROM Table1";
	
    ResultSet rs = stmt.executeQuery(sql1);


    printRs(rs);

    //STEP 6: Loop through result set and add 5 in age
    //Move to BFR postion so while-loop works properly
 //   rs.beforeFirst();




    //STEP 6: Loop through result set and add 5 in age
    //Move to BFR postion so while-loop works properly

//    printRs(rs);


    //STEP 8: Clean-up environment
  //  rs.close();
    stmt.close();
    myConn.close();
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

 public static void printRs(ResultSet rs) throws SQLException{
    
    while(rs.next()){
    	
       String a = rs.getString("Field1") + "," + rs.getString("Field2") + "," + rs.getString("Field3");
    	/*
       String str1 = rs.getString("Field1");
       String str2 = rs.getString("Field2");
       String str3 = rs.getString("Field3");
       String coma = ",";
       StringBuilder a = new StringBuilder();
       a.append(str1).append(coma).append(str2).append(coma).append(str3);
       StringBuilder sb = new StringBuilder();
       a.append(","); 
*/
       
       String[] b = a.split("(?=\\p{Lu})"); // split to low-case
		for (int i = 0; i < b.length; i++){ // every element
			System.out.print(b[i] + ","); // + space to upper
		}


     //������� ���������
//       System.out.print(a);

       // .replaceAll("[\\s]", "")
       
 }//end printRs()
}//end JDBCExample  
}


