package com.sb.unittesting.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class StringHelperTest {
	// Test functions should always be public and void
	private StringHelper helper = new StringHelper();

	@Test
	public void truncateAInFirst2Positions_doubleA_atStart() {

		// assertEquals(expected,actual);
		assertEquals("CD", helper.truncateAInFirst2Positions("AACD"));

	}

	@Test
	public void truncateAInFirst2Positions_singleA_atStart() {

		assertEquals("CD", helper.truncateAInFirst2Positions("ACD"));
	}

	@Test
	public void truncateAInFirst2Positions_noA_inWord() {
		assertEquals("CDEF", helper.truncateAInFirst2Positions("CDEF"));
	}

	@Test
	public void truncateAInFirst2Positions_doubleA_atEnd() {
		assertEquals("CDAA", helper.truncateAInFirst2Positions("CDAA"));
	}

}
