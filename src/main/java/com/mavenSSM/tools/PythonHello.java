package com.mavenSSM.tools;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;

public class PythonHello {
	public static void main(String[] args) throws InterruptedException {
		String result = "";

		try {
			Process process = Runtime.getRuntime().exec("python /Users/apple/PycharmProjects/learn/venv/it.py");
			// process.waitFor();
			while (true) {
				InputStreamReader ir = new InputStreamReader(process.getInputStream());
				LineNumberReader input = new LineNumberReader(ir);
				while ((result = input.readLine()) != null)
					System.out.println(result);

				input.close();
				ir.close();
				process.waitFor();
			}
			// process.waitFor();
		} catch (IOException e) {

		}
		System.out.println(result);
	}
}
