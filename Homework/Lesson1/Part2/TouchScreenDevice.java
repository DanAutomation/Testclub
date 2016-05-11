
public class TouchScreenDevice {
	public String model; //now it is internal attribute
	public String brand; //now it is internal attribute
	public String typeOfDevice; //now it is internal attribute
	private String nameOS; //now it is internal attribute
	private int cpu; //now it is internal attribute
	public int size; //now it is internal attribute
	private String ram; //now it is internal attribute
	private String memoryFunctions; //now it is internal attribute
	public boolean signal; //now it is internal attribute
	public int camera; //now it is internal attribute
	public void setName(String newModel){ //initialize name of device
		model = newModel;
	}
	public boolean call(){ // method realize opportunity to call
		return signal;
	}
	public void setSize(int height, int weight){ // // method count size
		size = height * weight;
		
	}
	public void camera(){ // method output signature what method can do
		System.out.println("camera made photo");
	}
	public int CPU(int cpu){ // initialize CPU data
		return cpu;
	}
	private void setRam(String addRam){ // add new size of RAM in total RAM
		ram += addRam;
	}
	private String nameOS(){ // give knowledge about name of OS
		return nameOS;
	}
	private String getTypeOfDevice(){ // give opportunity to select device
		return typeOfDevice;
	}
	private String funcMem(){ // describe memory settings 
		return memoryFunctions;
	}
	public void brand(){ // realized for identifiaction of data
	}
	

}