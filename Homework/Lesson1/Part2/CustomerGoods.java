package Lesson1;

public class CustomerGoods {
	private long dateOfProducing; //now it is internal attribute
	public String countryProducing; //now it is internal attribute
	private long productShelLife; //now it is internal attribute
	public String nameTrademark; //now it is internal attribute
	public long barcode; //now it is internal attribute
	public String typeOfGoods; //now it is internal attribute
	public double brutto; //now it is internal attribute
	private int weight; //now it is internal attribute
	public double size; //now it is internal attribute
	private double netto; //now it is internal attribute
	public String color; //now it is internal attribute
	private int height; //now it is internal attribute
	public double totalSize(int height, int weight){ // method create size of goods
		size = height * weight;
		return size;
	}
	public String brandName(){ // method initilize name of brand
		return nameTrademark;
	}
	public String color(){ // ability to input color
		return color;
	}
	private int height(){ // ability to input height
		return height;
	}
	public void barcode(){  // output barcode
	    System.out.println("barcode is: " + barcode); 
	}
	public void settypeOfGoods(String newTypeOfGood) // this method add new type of goods
	{
		this.typeOfGoods = newTypeOfGood;
	}
	private int weight(){ // ability input weight
		return weight;
	}
	public double getNetto() { // method situated for opportunity get neeto of goods
		return netto;
	}
	public void setNetto(double netto) { // ability set netto for goods
		this.netto = netto;
	}
	public long getProductShelLife() { // method realized for getting information how many time has customer for compleate using this goods
		return productShelLife;
	}
	public void setProductShelLife(long productShelLife) { //  method realized for setting information how many time has customer for compleate using this goods

		this.productShelLife = productShelLife;
	}
}