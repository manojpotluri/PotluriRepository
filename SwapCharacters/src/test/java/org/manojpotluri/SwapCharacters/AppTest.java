package org.manojpotluri.SwapCharacters;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AppTest {

	App a;
	@Before
	public void setUp() throws Exception {
		a = new App();
	}

	@After
	public void tearDown() throws Exception {
		a = null;
	}

	@Test
	public void test() {
		String teststring = "bata";
		String expected = "baat";
		String actual;
		actual = a.computeString(teststring);
		assertEquals(expected, actual);
	}
	@Test
	public void test2() {
		String teststring = "a";
		String expected = "a";
		String actual;
		actual = a.computeString(teststring);
		assertEquals(expected, actual);
	}
	@Test
	public void test3() {
		String teststring = "ab";
		String expected = "ba";
		String actual;
		actual = a.computeString(teststring);
		assertEquals(expected, actual);
	}
	@Test
	public void test4() {
		String teststring = "rani";
		String expected = "rain";
		String actual;
		actual = a.computeString(teststring);
		assertEquals(expected, actual);
	}
	@Test
	public void test5() {
		String teststring = "";
		String expected = "";
		String actual;
		actual = a.computeString(teststring);
		assertEquals(expected, actual);
	}
	@Test
	public void test6() {
		String teststring = "aba";
		String expected = "aab";
		String actual;
		actual = a.computeString(teststring);
		assertEquals(expected, actual);
	}

}
