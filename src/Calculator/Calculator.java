package Calculator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Calculator {
	public static int add(String num) {
		Pattern p = Pattern.compile("^[1-8](,[1-8])*$");
		Matcher m = p.matcher(num);
		int result = 0;
		if (m.find() == false) {
			System.out.println("No esta separado por comas");
			return -1;
		} else {
			if (num == "") {
				return result;
			} else {
				String[] splits = num.split(",");
				if (splits.length >= 3) {
					System.out.println("Error, mas de 3 números en la hilera");
					return -1;
				} else {
					for (int i = 0; i < splits.length; i++) {
						int num1 = Integer.parseInt(splits[i]);
						result += num1;
					}
				}
			}
		}

		return result;
	}

	public static int addModified(String num) {
		Pattern p = Pattern.compile("^[1-8](,[1-8])*$");
		Matcher m = p.matcher(num);
		int result = 0;
		if (m.find() == false) {
			System.out.println("No esta separado por comas");
			return -1;
		} else {
			if (num == "") {
				return result;
			} else {
				String[] splits = num.split(",|;");
				for (int i = 0; i < splits.length; i++) {
					int num1 = Integer.parseInt(splits[i]);
					result += num1;
				}

			}
		}

		return result;
	}
}
