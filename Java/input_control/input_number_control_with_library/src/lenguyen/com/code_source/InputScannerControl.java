/**Author: Lan Phuong Le Nguyen (lphuong3588@gmail.com)
Date : 08th of Feb 2021
This code will check input from keyboard if it is a number or number from min to max
*/

package lenguyen.com.code_source;

import java.util.Scanner;

public class InputScannerControl {
	
	
	//Verify if the String input is a number 
	public boolean isNumber(String numberInput) {
		
		if (numberInput == null)
			return false;
		try {
			Double.parseDouble(numberInput);
			} catch(NumberFormatException notNumber) {
			 return false;
		 }		 
		 return true;
		 
	}
	
	//Verify if the String input is a number within boudaries: minBoundary <= numberInput <= maxBoundary 
	public boolean isNumberWithBoundaries(String numberInput, double maxBoundary, double minBoundary) {
		
		if (this.isNumber(numberInput))
			if ( (Double.parseDouble(numberInput) >= minBoundary) && (Double.parseDouble(numberInput)<=maxBoundary) )
				return true;
		
		return false;
	}

}
