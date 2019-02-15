package FooBarQix;

public class FooBarQix {

	public static String process(int number) {
		String result = "";

		if (number % 3 == 0) {
			result += "FOO";
		}

		if (number % 5 == 0) {
			result += "BAR";
		}

		if (number % 7 == 0) {
			result += "QIX";
		}

		if (result == "") {
			return number + "";
		} else {
			return result;
		}

	}

}
