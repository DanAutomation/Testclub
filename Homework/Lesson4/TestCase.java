package Lesson4;

public class TestCase implements Test{

	String name, step;
	String expectedResult;
	
	public String generateStringFromResultSet() {
		// запихивает все значения в строку через запятую, это нужно для сравнения expectedResult и того, что вернется нам в ResultSet. Добавятся атрибуты actualResult (String), finalRresult(enum)
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
		this.name = name; // что делает sql-запрос
		this.step = step; // сам sql-запрос
		this.expectedResult = expectedResult; // преобразованный ResultSet, Sql-response преобразуются в строку с данными через запятую в переменную с именем expectedResult
	}
	
	
	
}