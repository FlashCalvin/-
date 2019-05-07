package com.tom;

import java.io.File;

public class Filetester {

	public static void main(String[] args) {
		int n = Integer.parseInt("87");
		File file = new File("ava.txt");
		System.out.println(file.isDirectory());
		System.out.println(file.exists());
		System.out.println(file.canExecute());
		System.out.println(file.getPath());
		System.out.println(file.getAbsolutePath());
		
		File dir = new File("C:\\Users\\Public");
	    if(dir.exists()&&dir.isDirectory()) {
	    	String[] files = dir.list();
	    	for (String s:files) {
	    		System.out.println(s);
	    	}
	    	
	    }

	}
	    

}
