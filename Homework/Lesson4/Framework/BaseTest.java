package Lesson4.Framework;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import jxl.Workbook;
import jxl.format.Alignment;
import jxl.format.Border;
import jxl.format.BorderLineStyle;
import jxl.format.CellFormat;
import jxl.format.Colour;
import jxl.write.Label;
import jxl.write.WritableCellFormat;
import jxl.write.WritableFont;
import jxl.write.WritableSheet;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class BaseTest extends BaseProcessor{
//	int id;
//	String name;
//	String type;
//	String query;
//	String filePath;
//	String expectedResult;
//	boolean isValid;
//	boolean result;
//	
//	public void readyAtributesName(){
//	
//	}
//	
//	public int getId(int id){
//		return this.id = id;
//	}
//	
//	public void getQuery(){
//		
//	}
	ArrayList<String> req; 
	String respons;
	 public BaseTest(){
		 this.req = req;
		 this.respons = respons;
	 }
	
	

	public void compareWithExpectedResultSimpleScenarios(ArrayList<String> req, String respons) throws IOException, RowsExceededException, WriteException{
		BaseProcessor tr = new BaseProcessor();
		tr.generateReport();
		myWorkbook= Workbook.createWorkbook(new File("D:\\checklist.xls"));
	    WritableSheet mySheet1 = myWorkbook.createSheet("Simple scenarios", 0);
		for(int i = 0; i < 15; i++){
		if(req.contains(respons)){
			
			Label label = new Label(2, i, "PASSED", getCellFormat(Colour.GREEN, Border.ALL, Alignment.CENTRE));
			mySheet1.addCell(label);
		}
		else{
			Label label_1 = new Label(2, i, "FAILED", getCellFormat(Colour.RED, Border.ALL, Alignment.CENTRE));
			mySheet1.addCell(label_1);
		}
	}}
	


	public void compareWithExpectedResultComplexScenarios(ArrayList<String> arr, String respons) throws WriteException, IOException{
		BaseProcessor tr = new BaseProcessor();
		tr.generateReport();
		myWorkbook= Workbook.createWorkbook(new File("D:\\checklist.xls"));
	    WritableSheet mySheet2 = myWorkbook.createSheet("Complex scenario", 0);
		for(int i = 0; i < 15; i++){
		if(arr.contains(respons)){
			
			Label label = new Label(2, i, "PASSED", getCellFormat(Colour.GREEN, Border.ALL, Alignment.CENTRE));
			mySheet2.addCell(label);
		}
		else{
			Label label_1 = new Label(2, i, "FAILED", getCellFormat(Colour.RED, Border.ALL, Alignment.CENTRE));
			mySheet2.addCell(label_1);
		}
		}}
	
	
//	public void parseExpectedResultToSet(){}
//	
	
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
