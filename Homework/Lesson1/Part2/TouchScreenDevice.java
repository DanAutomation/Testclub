
public class TouchScreenDevice {
	private String model; //now it is internal attribute
	private String brand; //now it is internal attribute
	private String typeOfDevice; //now it is internal attribute
	private String nameOS; //now it is internal attribute
	private int cpu; //now it is internal attribute
	private int size; //now it is internal attribute
	private int ram; //now it is internal attribute
	private String memoryFunctions; //now it is internal attribute
	private boolean signal; //now it is internal attribute
	private int camera; //now it is internal attribute
	
	public void setModel(String newModel){ //method helps get name of device
		model = newModel;
	}
	public String getModel(){ // method helps get model
		return model;
    }
	public void setBrand(String newBrand){ //method helps set brand of device
		brand = newBrand;
	}
	public String getBrand(){ // method helps get brand of device
		return brand;
    }
	public void setTypeOfDevice(String newTypeOfDevice){ //method helps set brand of device
		typeOfDevice = newTypeOfDevice;
	}
	public String getTypeOfDevice(){ // method helps get type of device
		return typeOfDevice;
    }
	public void setNameOS(String newNameOS){ //method helps set name of OS
		nameOS = newNameOS;
	}
	public String getNameOS(){ // method helps get name of OS
		return nameOS;
    }
	public void setCpu(String newCpu){ //method helps set CPU
		cpu = newCpu;
	}
	public int getCpu(){ // method helps get CPU
		return cpu;
    }
	public void setSize(String newSize){ //method helps set size of device
		size = newSize;
	}
	public int getSize(){ // method helps get size of device
		return size;
    }
	public void setRam(String newRam){ // method helps set ram of device
		ram = newRam;
	}
	public int getRam(){ // method helps get ram of device
		return ram;
    }
	public void setMemoryFunctions(String newMemoryFunctios){ // method helps get memory of functions
		memoryFunctions = newMemoryFunctions;
	}
	public String getMemoryFunctions(){ // method method helps get memory of functions
		return memoryFunctions;
    }
	public void setSignal(String newSignal){ //method helps set signal of device
		signal = newSignal;
	}
	public boolean getSignal(){ // method helps get signal of device
		return signal;
    }
	public void setCamera(String newCamera){ // method helps set camera of device
		camera = newCamera;
	}
	public int getCamera(){ // method helps get camera of device
		return camera;
    }
}