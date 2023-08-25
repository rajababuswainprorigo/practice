package com.prorigo.programs; //Package 

import java.io.*;

public class ProgramAnalyzer {

	public static void main(String[] args) {
		String folderPath = args[0]; //

		File folder = new File(folderPath);

		if (!folder.exists() || !folder.isDirectory()) {
			System.out.println("Invalid folder path."); //// if path doesn't exist......this will get print
			return;
		}

// Iterate through each .java file in the folder
		for (File file : folder.listFiles()) {
			if (file.isFile() && file.getName().endsWith(".java")) {
				analyzeJavaFile(file);// pass file if it is valid java file........
			}
		}
	}

	private static void analyzeJavaFile(File javaFile) {
		try (BufferedReader reader = new BufferedReader(new FileReader(javaFile))) {/// buffer reader package to read
																					/// file
			int methodCount = 0;
			String className = null;

			for (String line = reader.readLine(); line != null; line = reader.readLine()) {
				if (line.contains("class ")) {
					className = line.split(" ")[2].trim();
					if (className.contains("{")) {
						className = className.substring(0, className.indexOf("{")); // remove curly braces in class
																					// name....
					}
				} else if (line.contains("(") && line.contains(")") && line.contains("{") && !line.contains("class ")
						&& !line.contains("if ") && !line.contains("else ") && !line.contains("while ")
						&& !line.contains("for ") && !line.contains("switch ")) {
					methodCount++;
				}
			}

			if (className != null) { // not needed but for code practice.......
				System.out.println("Program name: " + className);
				System.out.println("Total number of methods: " + methodCount);
				System.out.println("--*----*----*------*-----*-----");
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}