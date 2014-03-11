package org.manojpotluri.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class WordCount {
	String str;
	int count = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WordCount wc = new WordCount();
				
	}
	
	WordCount() {
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(ir);
		System.out.println("Please enter a line :");
		try {
			str = br.readLine();
			System.out.println("this is the line read :\n" +str);
			System.out.println("String tokens for the passed line are :");
			StringTokenizer token = new StringTokenizer(str);
			while (token.hasMoreTokens()) {
				count++;
				str = token.nextToken();
				System.out.println(str);
			}
			System.out.println("\nWord Count = "+count);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
