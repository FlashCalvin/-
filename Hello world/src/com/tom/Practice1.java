package com.tom;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Practice1 {

	public static void main(String[] args) {
		
		List<Integer>bag = new ArrayList<Integer>();
		bag.add(4);
		bag.add(0);
		bag.add(7);
		bag.add(5);
		bag.add(7);
		bag.add(0);
		bag.add(0);
		bag.add(5);
		bag.add(0);
		System.out.println(bag);
	
		
		Set<Integer>word = new HashSet<Integer>();
		word.add(9);
		word.add(4);
		word.add(8);
		word.add(7);
		word.add(0);
		word.add(9);
		System.out.println(word);
	
	}
	

}
