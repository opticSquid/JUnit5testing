package com.sb.unittesting.junit;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

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

	@Test
	@Timeout(1)
	public void testSort_Performance() {
		// Default value of timeout in in seconds
		int[] array = { 12, 23, 4 };
		for (int i = 0; i < 1000000;i++) {
			array[0] = i;
			Arrays.sort(array);
		}
		
	}
}
