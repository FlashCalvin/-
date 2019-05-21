package com.tom;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class FileT1 {

	public static void main(String[] args) {
		try {
		FileInputStream fis = new FileInputStream("data.txt");
		Reader in = new InputStreamReader(fis);
		int n = in.read();
		}catch (FileNotFoundException e) {
			e.getStackTrace();
		}catch (IOException e) {
			e.getStackTrace();
		}

		

}
}
