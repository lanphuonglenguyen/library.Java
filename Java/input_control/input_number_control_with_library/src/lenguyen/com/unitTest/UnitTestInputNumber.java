/**Author: Lan Phuong Le Nguyen (lphuong3588@gmail.com)
Date : 08th of Feb 2021
This is a class JUnit to test our function to check our input from keyboard
**/

package lenguyen.com.unitTest;
import static org.junit.Assert.*;  
import org.junit.Test;

import lenguyen.com.code_source.InputScannerControl;

public class UnitTestInputNumber {
	
	//pay attetion, you need to put annotation Test and also public for the JUnit test
	@Test
	public void testInputNumber() {
		//ARRANGE
		final String stringTestNumber1 = "500.";//is number, true
		final String stringTestNumber2 = "5ab";//not number, false
		final String stringTestNumber3 = "53.3";//is number, not integer: true
		final String stringTestNumber4 = "53..3";//is number, not integer: false
		final InputScannerControl inputControl = new InputScannerControl();
		
		//ACT
		final boolean resultStringTestNumber1 = inputControl.isNumber(stringTestNumber1); 
		final boolean resultStringTestNumber2 = inputControl.isNumber(stringTestNumber2);
		final boolean resultStringTestNumber3 = inputControl.isNumber(stringTestNumber3);
		final boolean resultStringTestNumber4 = inputControl.isNumber(stringTestNumber4);
		
		//ASSERT
		assertEquals(resultStringTestNumber1, true);
		assertEquals(resultStringTestNumber2, false);
		assertEquals(resultStringTestNumber3, true);
		assertEquals(resultStringTestNumber4, false);
		
	}

}
