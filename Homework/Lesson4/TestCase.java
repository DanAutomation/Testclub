package Lesson4;

public class TestCase implements Test{

	String name, step;
	String expectedResult;
	
	public String generateStringFromResultSet() {
		// ���������� ��� �������� � ������ ����� �������, ��� ����� ��� ����������expectedResult�� ����, ��� �������� ��� �ResultSet.���������� ���������actualResult (String), finalRresult(enum)
		FinalResult Result = null;
		
		if(ExecutedTestCase.actualResult.contains(expectedResult)){
			Result = Result.PASSED;
		}
		else {
			Result = Result.FAILED;
		}
		return expectedResult;
	}

	public TestCase(String name, String step, String expectedResult){
		this.name = name; // ��� ������ sql-������
		this.step = step; // ��� sql-������
		this.expectedResult = expectedResult; // ���������������ResultSet,�Sql-response�������������� � ������ � ������� ����� ������� � ���������� � ������ expectedResult
	}
	
	
	
}