package com.sb.unittesting.junit;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class ArayCompare {

	@Test
	public void test() {
		int[] actual = { 1, 6, 2, 9, 3 };
		int[] expected = { 1, 2, 3, 6, 9 };
		Arrays.sort(actual);
		assertArrayEquals(expected, actual);
	}

	@Test()
	public void test_handle_exceptions() {
		int[] actual = null;
		assertThrows(NullPointerException.class, () -> {
			// Arrow function pointing having the code which produces the said exception
			Arrays.sort(actual);
		});
	}

}
