package com.hy4academy.filetest;

import java.io.File;

public class FileDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		File file = new File("test.txt");
		System.out.println(file.getAbsolutePath());
		System.out.println(file.getName());
		System.out.println("check if it is a file : " + file.isFile());

		File dir = new File(
				"C:\\HY4Academy_Workspace\\Java-Advanced\\FileDemo\\");

		System.out.println("check dir if it is a file : " + dir.isFile());
		System.out.println("check dir if it is a directory: "
				+ dir.isDirectory());

		for (String s : dir.list()) {
			File file1 = new File(s);
			if (file1.isFile()) {
				System.out.println("f " + s);
			} else {
				System.out.println("d " + s);
			}

		}
	}

}
