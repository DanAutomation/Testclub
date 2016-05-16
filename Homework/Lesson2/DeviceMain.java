package Lesson1;

public class DeviceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TouchScreenDevice sm1 = new TouchScreenDevice();
		TouchScreenDevice sm2 = new TouchScreenDevice();
		sm1.setModel("gt-i9500 galaxy s4");
		sm2.setModel("iPhone 3G");
		sm1.setBrand("Samsung");
		sm2.setBrand("Apple");
		sm1.setNameOS("Android");
		sm2.setNameOS("IOS");
		sm1.setCpu(1);
		sm2.setCpu(2);
		sm1.setCamera(16);
		sm2.setCamera(13);
		System.out.println("Brand of device is: " + sm1.getBrand());
		System.out.println("Model of device is: " + sm1.getModel());
		System.out.println("Os of device is: " + sm1.getNameOS());
		System.out.println("frequency of device is: " + sm1.getCpu());
		System.out.println("Camera is: " + sm1.getCamera() + " MP");
		System.out.println("---------------------------");
		System.out.println("Brand of device is: " + sm2.getBrand());
		System.out.println("Brand of device is: " + sm2.getModel());
		System.out.println("Os of device is: " + sm2.getNameOS());
		System.out.println("frequency of device is: " + sm2.getCpu());
		System.out.println("Camera is: " + sm2.getCamera() + " MP");

	}

}
