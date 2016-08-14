package Lesson4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import OnDel.Result;
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

public class ExecutedTestCase extends TestCase{


	static String actualResult;
	FinalResult Result;

	
	public ExecutedTestCase(String name, String step, String expectedResult) {
		super(name, step, expectedResult);
		
	}

	public String getActualResult() throws FileNotFoundException, IOException{
		try {
			
		Statement stmt = null;
		Connection con;
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root" , "testclub");

        

		    Properties props = new Properties();
		    props.load(new FileInputStream("D:/projects/Test/src/Lesson4/queries"));
		    for(int i = 0; i < 17; i++){
		    String sql = props.getProperty("sql" + i);
		    
		    stmt = con.createStatement();
		    ResultSet rs = stmt.executeQuery(sql);
		    
		    while (rs.next()) {
		    	String actualResult = rs.getString(0) + rs.getString(1);
		    	
		    	

		    }
		    
		    stmt.close();
			rs.close();
			
		}
		    } catch (SQLException e ) {
		    System.out.println("check");
		}
		return actualResult;
		
		

		 
	}
	
	
	public void setFinalResult() throws FileNotFoundException, IOException, WriteException{
        
		for(int i = 0; i < 17; i++)
		if(expectedResult.contains(getActualResult())){
			WritableWorkbook myWorkbook;
			myWorkbook= Workbook.createWorkbook(new File("D:\\checklist.xls"));
		    WritableSheet mySheet1 = myWorkbook.createSheet("Simple scenarios", 0);
		    WritableSheet mySheet2 = myWorkbook.createSheet("Complex scenarios", 1);
		    WritableFont cellFormat1 = new WritableFont(WritableFont.TIMES, 14);
		    WritableCellFormat cellFormat = new WritableCellFormat(cellFormat1);
		    cellFormat.setBorder(Border.ALL, BorderLineStyle.THICK);
		    cellFormat.setLocked(false);
		    cellFormat.setAlignment(Alignment.CENTRE);

			Label label = new Label(7, i, "PASSED", getCellFormat(Colour.GREEN, Border.ALL, Alignment.CENTRE));
			mySheet1.addCell(label);
			System.out.println("added");
 		}else{

 			WritableWorkbook myWorkbook;
 			myWorkbook= Workbook.createWorkbook(new File("D:\\checklist.xls"));
 		    WritableSheet mySheet1 = myWorkbook.createSheet("Simple scenarios", 0);
 		    WritableSheet mySheet2 = myWorkbook.createSheet("Complex scenarios", 1);
 		    WritableFont cellFormat1 = new WritableFont(WritableFont.TIMES, 14);
 		    WritableCellFormat cellFormat = new WritableCellFormat(cellFormat1);
 		    cellFormat.setBorder(Border.ALL, BorderLineStyle.THICK);
 		    cellFormat.setLocked(false);
 		    cellFormat.setAlignment(Alignment.CENTRE);
 		   Label label_1 = new Label(7, i, "FAILED", cellFormat);
			mySheet1.addCell(label_1);
			System.out.println("added");
 
 		}
	 		


}	
	
	private static WritableCellFormat getCellFormat(Colour colour,  Border boder, Alignment alignment) throws WriteException {
	    WritableFont cellFormat = new WritableFont(WritableFont.TIMES, 12);
	    WritableCellFormat cellFormat1 = new WritableCellFormat(cellFormat);
	    cellFormat1.setBorder(Border.ALL, BorderLineStyle.THICK);
	    cellFormat1.setWrap(true);
	    cellFormat1.setLocked(false);
	    cellFormat1.setBackground(colour);
	    cellFormat1.setAlignment(alignment);
	    return cellFormat1;
	  }
   
}
