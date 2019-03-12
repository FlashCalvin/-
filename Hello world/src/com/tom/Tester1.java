package com.tom;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Tester1 {

	public static void main(String[] args) {
		Random random= new Random();
		int[]freqs =  new int[20];
		List <Integer> list =  new ArrayList<>();
		for(int i = 0;i <10000;i++) {
			int r = random.nextInt(20);
			list.add(r);
			freqs[r]++;
		}
		for (int i= 0;i<freqs.length;i++) {
			System.out.println(i+":"+freqs[i]);
		}
		
		
//
	}

}
