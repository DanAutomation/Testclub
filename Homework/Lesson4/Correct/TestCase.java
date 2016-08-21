package Test;

public class TestCase implements Test{

	String name, step, expectedResult;
	
	public void generateStringFromResultSet() {
		
		
	}

	public TestCase(String name, String step, String expectedResult){
		this.name = name;
		this.step = step;
		this.expectedResult = expectedResult;
	}
	
}
