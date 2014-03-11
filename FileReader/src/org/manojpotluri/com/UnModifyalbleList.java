package org.manojpotluri.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class UnModifyalbleList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =0;
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);
		System.out.println("How many Names do you want to enter into a list ? :");
		try {
			n = Integer.parseInt(br.readLine());
						
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String[] names = new String[n];
		System.out.println("enter the names in the list : ");
		for(int i=0; i<n; i++) {
			try {
				names[i] = br.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		List<String> stringlist = Arrays.asList(names);
		System.out.println("elemensts available in the list are" +stringlist);
		stringlist = Collections.unmodifiableList(stringlist);
		
		System.out.println("\nTry to add an element to the unmodifiable list now");
		try {
			stringlist.set(0, br.readLine());
			System.out.println("elemensts available in the list are" +stringlist);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("elemensts cannot be added into the un modifiable list");
			e.printStackTrace();
		}
		
		
		

	}

}
