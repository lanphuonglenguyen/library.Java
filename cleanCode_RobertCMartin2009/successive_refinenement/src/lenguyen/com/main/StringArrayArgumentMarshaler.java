package lenguyen.com.main;

import java.util.HashSet;
import java.util.Iterator;
import java.util.NoSuchElementException;

import lenguyen.com.main.ArgsException.ErrorCode;

public class StringArrayArgumentMarshaler implements ArgumentMarshaler{
	private String[] stringArrayValue = new String[100];
	private int index = 0; 
	public void set(Iterator<String> currentArgument) throws ArgsException{
		try {
			stringArrayValue[index] = currentArgument.next() ;
			index++;
		} catch (NoSuchElementException e) {
			throw new ArgsException(ErrorCode.MISSING_STRING);
		}
	}
	
	public static String[] getValue(ArgumentMarshaler am) {
		if (am != null && am instanceof StringArgumentMarshaler)
			return ((StringArrayArgumentMarshaler) am).stringArrayValue;
		else
			return null;
	}

}
