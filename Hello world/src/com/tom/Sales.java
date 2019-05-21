package com.tom;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Sales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream k = new FileInputStream("Sales.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
