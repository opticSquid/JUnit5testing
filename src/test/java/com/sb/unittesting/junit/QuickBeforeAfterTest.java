package com.sb.unittesting.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class QuickBeforeAfterTest {

	@BeforeAll
	public static void before() {
		/*
		 * There are two annotations that can be applied here 
		 * 1) @BeforeAll (JUnit 5.x^)/@BeforeClass(JUnit 4.x) - Executes only once before all the @Test functions run .
		 * @BeforeAll function need to be public void static.
		 * 2) @BeforeEach (JUnit 5.x^)/@Before(JUnit 4.x) - Executes separately before execution of each @Test functions.
		 * @BeforeEach function need not to be static but only public void.
		 */
		
		// Example: Here you can open the connection to database
		
		System.out.println("Before function Executed");
	}

	@Test
	public void test1() {
		System.out.println("test1 executed");
		assertTrue(true);
	}

	@Test
	public void test2() {
		System.out.println("test2 executed");
		assertFalse(false);
	}

	@AfterAll
	public static void after() {
		/*
		 * There are two annotations that can be applied here 
		 * 1) @AfterAll(JUnit 5.x^) /@AfterClass (JUnit 4.x) - Executes only once after all the @Test functions run.
		 * @AfterAll function need to be public void static.
		 * 2) @AfterEach (JUnit 5.x^)/ @After(JUnit 4.x) - Executes separately after execution of each @Test functions
		 * @AfterEach function need not to be static but only public void.
		 */
		
		// Example: Here you can close the database connection
		
		System.out.println("After function executed");
		
	}

}
