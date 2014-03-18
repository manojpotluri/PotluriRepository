package org.manojpotluri.PalindromeTest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
 
public class PalindromeTest {

	private Palindrome p;
	@Before
	public void setUp() throws Exception {
		p = new Palindrome();
	}

	@After
	public void tearDown() throws Exception {
		p=null;
	}

	@Test
	public void test01IsPalindrome() {
		p.setStr("mom");
		assertEquals(true, p.isPalindrome(p.getStr()));
		
	}
	
	@Test
	public void test02IsPalindrome() {
		p.setStr("momy");
		assertEquals(false, p.isPalindrome(p.getStr()));
		
	}

}
