package com.sb.unittesting.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringHelperTest {

	@Test
	public void truncateAInFirst2Positions() {
		StringHelper helper = new StringHelper();
		// assertEquals(expected,actual);
		assertEquals("CD",helper.truncateAInFirst2Positions("AACD"));
		assertEquals("CD", helper.truncateAInFirst2Positions("ACD"));
	}

}
