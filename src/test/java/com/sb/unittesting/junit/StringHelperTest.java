package com.sb.unittesting.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringHelperTest {
	// Test functions should always be public and void

	@Test
	public void truncateAInFirst2Positions_doubleA_atStart() {
		StringHelper helper = new StringHelper();
		// assertEquals(expected,actual);
		assertEquals("CD", helper.truncateAInFirst2Positions("AACD"));

	}

	@Test
	public void truncateAInFirst2Positions_singleA_atStart() {
		StringHelper helper = new StringHelper();
		assertEquals("CD", helper.truncateAInFirst2Positions("ACD"));
	}

}
