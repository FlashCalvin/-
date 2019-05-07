package com.tom;

import java.io.File;

public class Filetester1 {

	public static void main(String[] args) {
		File d = new File("C:\\Users\\Public");
		if (d.exists()&&d.isDirectory()) {
			File[] files = d.listFiles();
			for (File f:files) {
				if (f.isFile()) {
					System.out.println(f.getName());
				}
			}
			System.out.println(d.mkdir());
			File GG = new File(d, "aaaa");
			System.out.println(GG.mkdir());
		}
		}

	

}
