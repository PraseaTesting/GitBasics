package com.Pages;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Testing {

	static FileInputStream fis = null;

	public static void main(String[] args) throws FileNotFoundException {
		try {
            Runtime rt = Runtime.getRuntime();
			rt.exec("cmd.exe /c start Taskkill /IM chromedriver.exe /f", null,
					new File(System.getProperty("user.dir")));
			System.out.println("Successfully Deleted Chromedriver.exe process from local system");

		} catch (Exception e) {
            e.printStackTrace();
		}

	}

}
