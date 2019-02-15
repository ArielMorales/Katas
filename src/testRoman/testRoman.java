package testRoman;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import Roman.RomanKata;

public class testRoman {

	@Test
	public void testOneDigit() {
		String number1 = "IV";
		String number2 = "VIII";

		int result1 = RomanKata.convert(number1);
		int result2 = RomanKata.convert(number2);

		assertEquals(4, result1, "Should return 4 as int");
		assertEquals(8, result2, "Should return 8 as int");
	}

	@Test
	public void testTwoDigits() {
		String number1 = "XI";
		String number2 = "XIII";

		int result1 = RomanKata.convert(number1);
		int result2 = RomanKata.convert(number2);

		assertEquals(11, result1, "Should return 11 as int");
		assertEquals(13, result2, "Should return 13 as int");
	}

	@Test
	public void testThreeDigits() {
		String number1 = "C";
		String number2 = "CDLV";

		int result1 = RomanKata.convert(number1);
		int result2 = RomanKata.convert(number2);

		assertEquals(100, result1, "Should return 100 as int");
		assertEquals(455, result2, "Should return 455 as int");
	}
	
	@Test
	public void testFourDigits() {
		String number1 = "MD";
		String number2 = "MDC";
		
		int result1 = RomanKata.convert(number1);
		int result2 = RomanKata.convert(number2);
		
		assertEquals (1500, result1, "Should return 1500 as int");
		assertEquals (1600, result2, "Should return 1600 as int");
	}

}
