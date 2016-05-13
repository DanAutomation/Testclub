package Lesson1;

public class CustomerGoods {
	private long dateOfProducing; //now it is internal attribute
	private String countryProducing; //now it is internal attribute
	private long productShelLife; //now it is internal attribute
	private String nameTrademark; //now it is internal attribute
	private long barcode; //now it is internal attribute
	private String typeOfGoods; //now it is internal attribute
	private double brutto; //now it is internal attribute
	private int weight; //now it is internal attribute
	private double size; //now it is internal attribute
	private double netto; //now it is internal attribute
	private String color; //now it is internal attribute
	private int height; //now it is internal attribute

    public long setDateOfProducing(long newDateOfProducing){ //method helps set date of producing
    	this.dateOfProducing = newDateOfProducing;
    }
    public long getDateOfProducing(){ //method helps get date of produce
    	return dateOfProducing;
    }
	public double getNetto() { //method helps get netto
		return netto;
	}
	public void setNetto(double netto) { //method helps set netto
		this.netto = netto;
	}
	public long getProductShelLife() { //method helps get product shel life
		return productShelLife;
	}
	public void setNetto(long productShelLife) { //method helps set product shel life 
		this.productShelLife = productShelLife;
	}
	public String getNameTrademars() { //method helps get name of trademark
		return nameTradeMark;
	}
	public void setNameTrademark(long newNameTrademark){ //method helps set name of trademark
		nameTrademark = newNameTrademark;
	}
	public long getBarcode() {  //method helps get name barcode
		return barcode;
	}
	public void setBarcode(long newBarcode){ //method helps set barcode
		barcode = newBarcode;
	}
	public String getTypeOfGoods() { //method helps get type of goods
		return typeOfGoods;
	}
	public void setTypeOfGoods(String newTypeOfGoods){ //method helps set type of goods
		typeOfGoods = newTypeOfGoods;
	}
	public double getBrutto() { //method helps get brutto
		return brutto;
	}
	public void setBrutto(String newBrutto){  //method helps set brutto
		brutto = newBrutto;
	}
	public int getWeight() { //method helps get weight
		return weight;
	}
	public void setWeight(int newWeight){ //method helps set weight
		weight = newWeight;
	}
	private double getSize() { //method helps get size
		return size;
	}
	private void setSize(String newSize){ //method helps set size
		size = newSize;
	}
	private int getHeight() { //method helps get height
		return height;
	}
	private void setHeight(int newHeight){ //method helps set height
		height = newHeight;
	}
	public String getColor() { //method helps get color
		return color;
	}
	public void setColor(String newColor){ //method helps set color
		color = newColor;
	}
}