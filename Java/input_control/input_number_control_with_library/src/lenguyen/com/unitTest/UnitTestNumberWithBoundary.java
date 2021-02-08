/**Author: Lan Phuong Le Nguyen (lphuong3588@gmail.com)
Date : 08th of Feb 2021
This is a class JUnit to test our function to check our input from keyboard
**/
package lenguyen.com.unitTest;
import static org.junit.Assert.*;  
import org.junit.Test;

import lenguyen.com.code_source.InputScannerControl;

public class UnitTestNumberWithBoundary {
	
	@Test
	public void UnitTestWithBoundary() {
	//ARRANGE
	final String stringTest1 = "50.3";// true
	final String stringTest2 = "50a";// false
	final String stringTest3 = "5.";//false
	final String stringTest4 = "20.";// true
	final String stringTest5 = "10.";//true
	
	final double minBoundary = 10.;
	final double maxBoundary = 50.3;
	
	final InputScannerControl inputControl = new InputScannerControl();
	
	//ACT
	final boolean resultNumberWithBoundary1 = inputControl.isNumberWithBoundaries(stringTest1, maxBoundary, minBoundary); 
	final boolean resultNumberWithBoundary2 = inputControl.isNumberWithBoundaries(stringTest2, maxBoundary, minBoundary);
	final boolean resultNumberWithBoundary3 = inputControl.isNumberWithBoundaries(stringTest3, maxBoundary, minBoundary);
	final boolean resultNumberWithBoundary4 = inputControl.isNumberWithBoundaries(stringTest4, maxBoundary, minBoundary);
	final boolean resultNumberWithBoundary5 = inputControl.isNumberWithBoundaries(stringTest5, maxBoundary, minBoundary);
	
	//ASSERT
	assertEquals(resultNumberWithBoundary1, true);
	assertEquals(resultNumberWithBoundary2, false);
	assertEquals(resultNumberWithBoundary3, false);
	assertEquals(resultNumberWithBoundary4, true);
	assertEquals(resultNumberWithBoundary4, true);
	}

}
