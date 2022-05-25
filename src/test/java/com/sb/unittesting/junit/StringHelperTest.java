package com.sb.unittesting.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.runners.Parameterized.Parameters;

class StringHelperTest {
	// Test functions should always be public and void
	private StringHelper helper = new StringHelper();

	/*
	 * In JUnit till version 4 you needed to put @RunWith(Parameterized.class)
	 * annotation to the class. But in JUnit 5 you only need to do @Parameterized
	 * Test to the function running parameterized test
	 */

	/*Here using @CsvSource we arranged our input and expected value in a comma separated manner
	 * and taking two  in the testing function arranged as our csv arrangement that is AACD is input and CD is output
	 * SO String input goes first and String expected goes second 
	 */
	@ParameterizedTest
	@CsvSource({ "AACD, CD", "ACD, CD", "CDEF, CDEF", "CDAA, CDAA" })
	public void truncateAInFirst2Positions_doubleA_atStart(String input, String expected) {

		// assertEquals(expected,actual);
		assertEquals(expected, helper.truncateAInFirst2Positions(input));

	}
}
