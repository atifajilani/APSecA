import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;

class gitClassTest {
	//private gitClass objCalcUnderTest;

	@Before
	public void setUp() {
	//Arrange
//		objCalcUnderTest = new gitClass();
	}
	@Test
	void test() {
		int a = 15; int b = 20; 
		int expectedResult = 35;
		gitClass objCalcUnderTest= new gitClass();
		//Act 
		
		int result = objCalcUnderTest.add(a, b);
		//Assert
		Assert.assertEquals(expectedResult, result);
	}

}
