package Lesson1;

public class WorkerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WorkerOfCompany wor1 = new WorkerOfCompany();
		WorkerOfCompany wor2 = new WorkerOfCompany();
		wor1.setName("Bob");
		wor2.setName("Billy");
		wor1.setPosition("QA Automation Engineer");
		wor2.setPosition("QA Engineer");
		wor1.setYears(21);
		wor2.setYears(20);
		wor1.setSex("man");
		wor2.setSex("man");
		wor2.setExpInYears(1);
		wor1.setExpInYears(2);
		System.out.println("Name of worker is: " + wor1.getName());
		System.out.println("position of worker is: " + wor1.getPosition());		
		System.out.println("age of worker is: " + wor1.getYears());
		System.out.println("sex: " + wor1.getSex());
		System.out.println("total experience is: " + wor1.getExpInYears());
		System.out.println("-----------------------------");
		System.out.println("Name of worker is: " + wor2.getName());
		System.out.println("position of worker is: " + wor2.getPosition());
		System.out.println("age of worker is: " + wor2.getYears());
		System.out.println("sex: " + wor1.getSex());
		System.out.println("total experience is: " + wor2.getExpInYears());
	}

}
