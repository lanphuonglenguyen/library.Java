package lenguyen.com.main;

import java.util.Iterator;
import java.util.NoSuchElementException;

import lenguyen.com.main.ArgsException.ErrorCode;

public class DoubleArgumentMarshaler implements ArgumentMarshaler{
	private double doubleValue = 0.;
	
	public void set(Iterator<String> currentArgument) throws ArgsException {
		String parameter = null;
		try {
			parameter = currentArgument.next();
			doubleValue = Double.parseDouble(parameter);
		} catch (NoSuchElementException e) {
			throw new ArgsException(ErrorCode.MISSING_DOUBLE);
		} catch (NumberFormatException e) {
			throw new ArgsException(ErrorCode.INVALID_DOUBLE, parameter);
		}
	}

	public static double getValue(ArgumentMarshaler am) {
		if (am!= null && am instanceof IntegerArgumentMarshaler)
			return ((DoubleArgumentMarshaler) am).doubleValue;
		else
			return 0.;
	}
}

