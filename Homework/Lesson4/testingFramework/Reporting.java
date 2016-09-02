package Lesson4.testingFramework;



	import java.io.File;
	import java.io.IOException;
	import java.sql.Connection;
	import java.sql.DriverManager;

	import jxl.Workbook;
	import jxl.format.Alignment;
	import jxl.format.Border;
	import jxl.format.BorderLineStyle;
	import jxl.write.Label;
	import jxl.write.WritableCellFormat;
	import jxl.write.WritableFont;
	import jxl.write.WritableSheet;
	import jxl.write.WritableWorkbook;
	import jxl.write.WriteException;

	public class Reporting {

		public void generateHTMLreport(String pathToReports) throws IOException, WriteException {
			// îòêðûòü íîâûé ôàéë äëÿ çàïèñè
			// ïîëíûé ïóòü ê ýòîìó ôàéëó âûãëÿäåò òàê: pathToReports + "testReport" + yyyymmddhhss
			String fullPathToFile = pathToReports+ "";  // îò ñþäà https://docs.oracle.com/javase/tutorial/datetime/iso/datetime.html
			
			WritableWorkbook myWorkbook;
			myWorkbook = Workbook.createWorkbook(new File(fullPathToFile));
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
		 
		    
		    // close processes
		    myWorkbook.write();
		    myWorkbook.close();
			
			
		}



	}

