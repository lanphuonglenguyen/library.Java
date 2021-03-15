package lenguyen.com.main;

public class main {
	public static void main(String[] args) {
		try {
			Args arg = new Args ("1, p#, d*", args);
			boolean logging = arg.getBoolean('1');
			int port = arg.getInt('p');
			String directory = arg.getString('d');
		}catch (ArgsException e) {
			System.out.printf(" Argument error : %s\n ", e.errorMessage());
		}
	}

}
