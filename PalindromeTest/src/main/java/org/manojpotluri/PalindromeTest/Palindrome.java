package org.manojpotluri.PalindromeTest;

public class Palindrome {

	private String str;

	

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	public boolean isPalindrome(String str) {
		String s = new StringBuilder(str).reverse().toString();
		int i = s.compareToIgnoreCase(str);
		if(i==0)
			return true;
		else
			return false;
	}

}
