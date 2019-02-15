package testCalculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import Calculator.Calculator;

public class testCalculator {
	@Test
	public void TestSuma1Numero() {
		int result = Calculator.add("1");
		assertEquals(1, result, "Should return 1 as an integer");
	}

	@Test
	public void TestSuma2Numeros() {
		int result = Calculator.add("1,2");
		assertEquals(3, result, "Should return 3 as an integer");

	}

	@Test
	public void TestSuma3Numeros() {
		int result = Calculator.add("1,2,3");
		assertEquals(-1, result, "Should return error");

	}

	@Test
	public void TestSumaMalInput() {
		int result = Calculator.add("2[1[3");
		assertEquals(-1, result, "Should return error");

	}

	/*-----------------------------------------------------------------------------------------------------------------------------------*/
	@Test
	public void TestSuma1NumeroModified() {
		int result = Calculator.addModified("1");
		assertEquals(1, result, "Should return 1 as an integer");
	}

	@Test
	public void TestSuma2NumerosModified() {
		int result = Calculator.addModified("1,2");
		assertEquals(3, result, "Should return 3 as an integer");

	}

	@Test
	public void TestSuma3NumerosModified() {
		int result = Calculator.addModified("1,2,3");
		assertEquals(6, result, "Should return error");

	}

	@Test
	public void TestSumaMalInputModified() {
		int result = Calculator.addModified("2[1[3");
		assertEquals(-1, result, "Should return error");

	}

}
